package com.bmpl.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity : AppCompatActivity()/*, View.OnClickListener*/ {

//    override fun onClick(p0: View?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

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

    }

}



