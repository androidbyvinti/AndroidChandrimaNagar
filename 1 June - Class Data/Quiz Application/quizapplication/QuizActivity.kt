package com.bmpl.quizapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {

    lateinit var questionsArray : Array<String>
    lateinit var optionsArray : Array<String>
    lateinit var ansArray : Array<String>
    var counter = 0
    var score = 0

    lateinit var buttonArray: Array<Button>
    lateinit var imagesArray : Array<ImageView>
    var wrongAns = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        buttonArray = arrayOf(btn1, btn2, btn3, btn4)

        imagesArray  = arrayOf(image3, image2, image1)

        var userChoiceIntent = intent

        var choice = userChoiceIntent.getStringExtra("choice")

        when(choice){
            "C"->{
                questionsArray = resources.getStringArray(R.array.cQuestions)
                optionsArray = resources.getStringArray(R.array.cOptions)
                ansArray = resources.getStringArray(R.array.cAns)
            }
        }

        submitButton.setOnClickListener {
            var intent = Intent(this, ScoreActivity :: class.java)
            intent.putExtra("score", score)
            startActivity(intent)
        }

        loadNextQuestion()
                            // anonymous class creatation
        var countDownTimer  = object  : CountDownTimer(20000, 1000){

            //<= 0 sec
            override fun onFinish() {
                counter++
                loadNextQuestion()
            }
                // 1 sec
            // > 0 sec
            override fun onTick(p0: Long) {
                    timerTextView.text = (p0/1000).toString()
            }
        }
        countDownTimer.start() //
        // countDownTimer.cancel()

        // class  ref:  CountDownTimer(){ abstract }
    }

    fun optionButtonClicked(view : View){
        checkCorrectAns(view)
        counter++
        loadNextQuestion()
    }

    fun loadNextQuestion(){
        questionsTextView.text = questionsArray[counter]   // 0 1 2
        btn1.text = optionsArray[counter * 4]
        btn2.text = optionsArray[counter * 4 + 1]
        btn3.text = optionsArray[counter * 4 + 2]
        btn4.text = optionsArray[counter * 4 + 3]

        btn1.setBackgroundColor(Color.WHITE)
        btn2.setBackgroundColor(Color.WHITE)
        btn3.setBackgroundColor(Color.WHITE)
        btn4.setBackgroundColor(Color.WHITE)
    }

    fun checkCorrectAns(view : View){

        var button = findViewById<Button>(view.id)

        if(button.text.toString().equals(ansArray[counter])){
            score++
            button.setBackgroundColor(Color.GREEN)
        }else{
            button.setBackgroundColor(Color.RED)

            for(i in buttonArray){
                if(i.text == ansArray[counter]){
                    i.setBackgroundColor(Color.GREEN)
                }
            }

            imagesArray[wrongAns].visibility = View.INVISIBLE
            wrongAns++

//            when (wrongAns) {
//                1 -> image3.visibility = View.INVISIBLE
//                2 -> image2.visibility = View.INVISIBLE
//                3 -> image1.visibility = View.INVISIBLE
//                else -> {
//                    //var intent = Intent()
//                    //startActivity()
//                }
//            }

        }
    }
}