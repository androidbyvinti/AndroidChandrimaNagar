package com.bmpl.firstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


// package-centric language -->  folder

// Activity --> always inherit a parent Activity
// MainActivity --> Activity class is a root class of all the activities we have
class MainActivity : AppCompatActivity() {
    // when ever an object is created a constructor is called
    // constructor will be called when a child class inherits a parent class -->
    // parent class cons will be called

    // MainActivity(){
    //  ....
    // }

    // MainAcitivity obj;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
