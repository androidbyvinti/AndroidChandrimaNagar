package com.bmpl.recyclerview

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    // LayoutManager --> LinearLayoutManager or GridLayoutManager

    lateinit var layoutManager : RecyclerView.LayoutManager

    lateinit var recyclerAdapter : RecyclerView.Adapter<*>

    var list = arrayOf("Data 1", "Data 2", "Data 3",
                        "Data 4", "Data 5", "Data 6",
                        "Data 7", "Data 8", "Data 9",
                        "Data 10", "Data 11", "Data 12",
                        "Data 13", "Data 14", "Data 15",
                        "Data 16", "Data 17", "Data 18",
                        "Data 19", "Data 20", "Data 21",
                        "Data 22", "Data 23", "Data 24")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        layoutManager = LinearLayoutManager(this)

//        recyclerAdapter = CustomAdapter(list)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = CustomAdapter(list)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
