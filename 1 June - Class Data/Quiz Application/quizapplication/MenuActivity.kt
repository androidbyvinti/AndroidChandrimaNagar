package com.bmpl.quizapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun buttonClicked(view: View){
        var button = findViewById<Button>(view.id) // button --> text -->
        var intent = Intent(this, QuizActivity :: class.java)
        intent.putExtra("choice", button.text.toString())
        startActivity(intent)
    }

}
