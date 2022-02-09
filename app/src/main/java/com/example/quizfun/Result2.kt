package com.example.quizfun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)


        val score=intent.getIntExtra(Constants.SCORE,0)
        val result: TextView =findViewById(R.id.textView4)
        if(score==50){
            result.text="Are you sure you are not a high profile cricket analyst? Cause you answered every question correctly!"
        }
        else if (score==40 ){
            result.text="You were almost flawless!You do are a big fan"
        }
        else if(score==30){
            result.text="Maybe you don't care about stats a lot just watch cricket for fun.You can do better!"
        }
        else if (score ==20){
            result.text="Uhh okay,,well you lack in cricket awareness my friend,,but there's always scope for improvement"
        }
        else if (score==10){
            result.text="No words,,you cant call yourself a true cricket fan!"
        }
        else if(score==0){
            result.text="Fan and you?Why did you even take this quiz ,pal!"
        }
        val end: Button =findViewById(R.id.button2)
        end.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }






    }
}