package com.bmpl.sumapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sumButton.setOnClickListener {

            // Debug mode -->

            if(firstEditText.text.isNotBlank() && secondEditText.text.isNotBlank()) {

                try {

                    var first: Int = firstEditText.text.toString().toInt()
                    var second: Int = secondEditText.text.toString().toInt()

                    resultTextView.text = (first + second).toString()    // 10 12 --> "22"

                } catch (numberFormatException : NumberFormatException){
                    Toast.makeText(this, "Only Numbers are allowed", Toast.LENGTH_LONG).show()
                }



            } else{
                // android.widget package
                // 1 param --> current class ref--> this(current object reference)
                // 2 param --> "Message to be displayed to user" --> String
                // 3 param --> Duration --> Length_long, short

                Toast.makeText(this, "Fields cannot be empty!!!", Toast.LENGTH_SHORT).show()

                //resultTextView.text = "Fields cannot be empty!!!"
            }


        }

        cancelButton.setOnClickListener {

            firstEditText.text = null       //""
            secondEditText.text = null
            resultTextView.text = null

        }

    }
}
