package com.example.quizfun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score=intent.getIntExtra(Constants.SCORE,0)
        val result:TextView=findViewById(R.id.textView4)
        if(score>46){
            result.text="You,my friend,are the wokest woke out there! You are vocal for your liberal views and proudly espouse your ideology"
        }
        else if (score in 39..46){
            result.text="You are close, but NOT a woke.Although you are very liberal and believe in your views! "
        }
        else if(score in 31..38){
            result.text="You are far from being a woke.In fact you are somewhere in the middle of being a conservative and liberal-a centrist.You have flexible views and believe in rational thoughts whether it is from any side of the spectrum!"
        }
        else if (score in 26..31){
            result.text="Woke and you? LOL.You are at the opposite side of being a woke,you are a conservative and believe in traditions and cultural beliefs and their preservance,,with a blend of modernity"
        }
        else if (score in 20..25){
            result.text="Well you knew the result already!You are farthest from being a woke.You are a hardcore conservative and are waiting to become part of a movement to re-arise your culture and traditional values.You espouse your ideology and loath the liberal-woke bs!"
        }
        val end:Button=findViewById(R.id.button2)
        end.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }


    }
}
