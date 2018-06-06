package com.bmpl.animations

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setBackgroundResource(R.drawable.frame_animation)

        var animationDrawable : AnimationDrawable = imageView.background as AnimationDrawable

        startAnimation.setOnClickListener {
            animationDrawable.start()
        }
    }
}