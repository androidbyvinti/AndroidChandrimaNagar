package com.bmpl.firstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


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

    // override --> functionality

    // super --> when ever you have to access the feature of Parent class use super keyword
    override fun onCreate(savedInstanceStnstancate: Bundle?) {
            super.onCreate(savedInstanceStnstancate) // predefined functionality
            setContentView(R.layout.activity_main) // Predefined Method --> Activity class

        // step-1--> Downcasting
        // step-2--> Attaching Event Listener
        // step-3--> Attaching Event Handler

        // R --> R.java --> a predefined class automatically created with every project
        // id of every resource in your project which is taken by android os for accessing
        //your data
        // <Button extends View> findViewById
        //var button = findViewById<Button>(R.id.mybutton) // View --> Parent class --> Button, RelativeLyaout


        // predefined method --> listener attach
        mybutton.setOnClickListener {     // step-2: Listener attached

            // step-3: Attach Handler
            mybutton.text = "you clicked here!!!"
        }

        /*
            button.setOnClickListener(new View.OnClickListener{
                @override
                void onClick(View view){
                    ....
                }
            })



         */


        // Data obj = new Data1(); //

        // class Data{}  class Data1: class Data {}   Data1 obj --> forcefully convert child reference

    }

    fun buttonClciked(){

    }
}
