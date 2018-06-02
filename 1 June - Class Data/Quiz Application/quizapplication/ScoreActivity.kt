package com.bmpl.quizapplication

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {

    var highScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        var scoreIntent = intent
        var score = scoreIntent.getIntExtra("score", 0) // 50

        // SharedPreference --> Interface --> key : value -->
        // Shared preference -->  1 file --> whole application --> getPreferences(int mode)
        // per activity --> single file --> getSharedPreferences(string nameoffile, int mode)

        // writing --> SharedPreferences.Editor

        // reading --> SharedPreferences

        var readPreferences : SharedPreferences = getPreferences(Context.MODE_PRIVATE)
        var userScore = readPreferences.getInt("highscore", 0)
        // 50 > 34
        if(score > userScore){
            var sharedPreferences : SharedPreferences.Editor = getPreferences(Context.MODE_PRIVATE).edit()
            sharedPreferences.putInt("highscore", score) // key : value
            sharedPreferences.apply()   // write into file otherwise not
            scoreTextView.text = "Highest Score : $score"
        } else{
            scoreTextView.text = "Highest Score : $userScore"
        }



        // data write with shared pref

        //Mode
        // Context_private --> always going to overwrite the data
        // Context_Append  --> always going to append the data at the end




    }
}
