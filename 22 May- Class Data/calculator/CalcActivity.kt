package com.bmpl.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity : AppCompatActivity()/*, View.OnClickListener*/ {

//    override fun onClick(p0: View?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    var first  = 0
    var currentOperation = ""
    var second = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        // multiple event listener and multiple event handler
        btn7.setOnClickListener {
        }
        // this -->predefind keyword kotlin --> this always point to current instance --> class

        // multiple event listener and single event handler
//        btn7.setOnClickListener(this)
//        btn8.setOnClickListener(this)
//        btn3.setOnClickListener(this)
//        btn2.setOnClickListener(this)
//        btn1.setOnClickListener(this)
    }

    // single listener and single handler

    fun buttonClicked(view: View){
    // 56+
        val button = findViewById<Button>(view.id) // 9
                        // 54 +53 =
        inputTextView.text = inputTextView.text.toString() + button.text
        if(currentOperation.isNotBlank())
            second = inputTextView.text.toString().substringAfterLast(currentOperation).toInt()
    }

    fun operationRequested(view: View){ // +, -, *, /
        // 67+56      first number(67) + secondnumber(56)
        val button = findViewById<Button>(view.id)

        first = inputTextView.text.toString().toInt()

        inputTextView.text = inputTextView.text.toString() + button.text

        currentOperation = button.text.toString()
        // 67+56 --> first: 67+
    }

}



