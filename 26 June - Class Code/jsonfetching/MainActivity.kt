package com.bmpl.jsonfetching

import android.app.ProgressDialog
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import org.json.JSONException
import org.json.JSONObject
import java.util.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private var pDialog: ProgressDialog? = null
    private var lv: ListView? = null

    lateinit var contactList: ArrayList<HashMap<String, String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactList = ArrayList()

        lv = findViewById<ListView>(R.id.list)

        GetContacts().execute() // AysncTask
    }

    private inner class GetContacts : AsyncTask<Void, Void, Void>() {

        override fun onPreExecute() {
            super.onPreExecute()
            // Showing progress dialog
            pDialog = ProgressDialog(this@MainActivity)
            pDialog!!.setMessage("Loading Data...")
            pDialog!!.setCancelable(false)
            pDialog!!.show()

        }

        override fun doInBackground(vararg arg0: Void): Void? {
            val sh = HttpHandler() // url hit and url data fetch --> string

            // Making a request to url and getting response
            val jsonStr = sh.makeServiceCall(url) // String --> data or null

            Log.e(TAG, "Response from url: " + jsonStr!!)

            if (jsonStr != null) {
                try {
                    val jsonObj = JSONObject(jsonStr)

                    val contacts = jsonObj.getJSONArray("empdata")

                    for (i in 0 until contacts.length()) {
                        val c = contacts.getJSONObject(i)

                        val id = c.getString("id")
                        val name = c.getString("name")
                        val email = c.getString("email")

                        val phone = c.getJSONObject("phone")
                        val mobile = phone.getString("mobile")
                        val home = phone.getString("home")

                        val contact = HashMap<String, String>()

                        contact.put("id", id)
                        contact.put("name", name)
                        contact.put("email", email)
                        contact.put("mobile", mobile)

                        contactList.add(contact)
                    }
                } catch (e: JSONException) {
                    Log.e(TAG, "Json parsing error: " + e.message)
                    runOnUiThread {
                        Toast.makeText(applicationContext,
                                "Json parsing error: " + e.message,
                                Toast.LENGTH_LONG)
                                .show()
                    }

                }

            } else {
                Log.e(TAG, "Couldn't get json from server.")
                runOnUiThread {
                    Toast.makeText(applicationContext,
                            "Couldn't get json from server. Check LogCat for possible errors!",
                            Toast.LENGTH_LONG)
                            .show()
                }

            }

            return null
        }

        override fun onPostExecute(result: Void) {
            super.onPostExecute(result)
            if (pDialog!!.isShowing)
                pDialog!!.dismiss()

            val adapter = SimpleAdapter(
                    this@MainActivity, contactList,
                    R.layout.list_item, arrayOf("name", "email", "mobile"), intArrayOf(R.id.name, R.id.email, R.id.mobile))

            lv!!.adapter = adapter
        }

    }

    companion object {

        private val url = "http://www.json-generator.com/api/json/get/cfeQUnJbQO?indent=2"
    }
}