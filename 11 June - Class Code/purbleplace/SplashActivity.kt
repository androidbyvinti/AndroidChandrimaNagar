package com.bmpl.purbleplace

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed(Runnable {
            startActivity(Intent(this, MenuActivity :: class.java))
            finish()
        },
                3000)

    }
}