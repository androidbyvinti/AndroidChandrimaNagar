package com.bmpl.intent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
                                                            //email

        signInButton.setOnClickListener {

            // step-1: create an instance of Intent class
                        // src and destination(java class file)         name
            var intent = Intent(this, SecondActivity :: class.java)

            // step-2: take data from edittext and pass it to the instance of Intent

            var name = nameEditText.text.toString()

            intent.putExtra("username", name) // key and value


            // step-3: set destination and fire the intent object
            startActivity(intent)
        }

    }
}

