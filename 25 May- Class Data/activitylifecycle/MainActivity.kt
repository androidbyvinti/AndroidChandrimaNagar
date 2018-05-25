package com.bmpl.activitylifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // String tag --> name of your class, name of your method or name of your variable
        // var value = 90    value = value *5 +76 +21 *2
        Log.i(TAG, "inside onCreate()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "inside onDestroy()")
    }


    override fun onStop() {
        super.onStop()
        Log.i(TAG, "inside onStop()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "inside onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "inside onRestart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "inside onResume()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "inside onStart()")
    }

}
