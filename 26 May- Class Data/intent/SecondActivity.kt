package com.bmpl.intent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // step-1: receive intent object

        var receivingIntent : Intent = intent   // getIntent() --> intent

        // step-2: unpack the data by extracting key

        var name = receivingIntent.getStringExtra("username")

        userName.text = name

        Toast.makeText(this, "Welcome $name", Toast.LENGTH_LONG).show()
    }
}
