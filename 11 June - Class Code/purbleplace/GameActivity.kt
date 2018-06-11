package com.bmpl.purbleplace

import android.animation.AnimatorInflater
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    var imagesArray = arrayOf(R.drawable.image1,  R.drawable.image2,
                                R.drawable.image3, R.drawable.image4,
                                R.drawable.image5, R.drawable.image6,
                                R.drawable.image7, R.drawable.image8,
                                R.drawable.image1,  R.drawable.image2,
                                R.drawable.image3, R.drawable.image4,
                                R.drawable.image5, R.drawable.image6,
                                R.drawable.image7, R.drawable.image8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val animator = AnimatorInflater.loadAnimator(this, R.animator.flip_animation)
        animator.setTarget(card1)

        card1.setOnClickListener {
            animator.start()    // play animation
            // array --> 0-15
            card1.setImageResource(imagesArray[0])
        }
        card2.setOnClickListener {
            animator.start()    // play animation
            // array --> 0-15
            card1.setImageResource(imagesArray[1])

            var value : String = card2.toString()
            var res = value.takeLast(value.lastIndex)
            Log.i("res = ", res)
        }
    }
}
