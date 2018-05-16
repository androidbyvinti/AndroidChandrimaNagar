package com.bmpl.sumapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sumButton.setOnClickListener {

           var first : Int =  firstEditText.text.toString().toInt()
            var second : Int = secondEditText.text.toString().toInt()

           resultTextView.text = (first + second).toString()    // 10 12 --> "22"
        }

        cancelButton.setOnClickListener {

            firstEditText.text = null       //""
            secondEditText.text = null
            resultTextView.text = null

        }

    }
}
