package com.bmpl.mediafiles

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pathOfVideo  = "android.resource://$packageName/${R.raw.small}"

        videoView.setVideoPath(pathOfVideo)
        //var mediaController = MediaController(this)

        videoView.setMediaController(MediaController(this))

        videoView.start()   // will start playing video

        // videoView.stopPlayback()


        // MediaPlayer class -->
//        var mediaPlayer = MediaPlayer.create(this, R.raw.song)
//
//        playButton.setOnClickListener {
//            mediaPlayer.start() // play
//        }
//
//        pauseButton.setOnClickListener {
//            mediaPlayer.pause()
//        }
//
//        stopButton.setOnClickListener {
//            mediaPlayer.stop()
//        }

    }
}
