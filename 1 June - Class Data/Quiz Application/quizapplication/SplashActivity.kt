package com.bmpl.quizapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    val DELAY_MILLISECONDS = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        // step-1 Intent
        // step-2 Handler class

        var run = Runnable {
            var intent = Intent(this, MenuActivity :: class.java)
            startActivity(intent)
            finish()    // Activity -->
        }


        var handler = Handler()
        handler.postDelayed(run, DELAY_MILLISECONDS)   // Runnable ---> Predefined Interface --> abstract method --> override

    }
}
