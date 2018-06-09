package com.bmpl.animations

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        imageView.setBackgroundResource(R.drawable.frame_animation)
//
//        var animationDrawable : AnimationDrawable = imageView.background as AnimationDrawable

        var fadeInOut : Animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)

        startAnimation.setOnClickListener {

            imageView.startAnimation(fadeInOut)

            //animationDrawable.start()
        }
    }
}