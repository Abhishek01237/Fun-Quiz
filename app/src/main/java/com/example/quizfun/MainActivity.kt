package com.example.quizfun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v:CardView=findViewById(R.id.cvew)
        v.setOnClickListener{
            val intent=Intent(this,Questions_Activity::class.java)
            startActivity(intent)
        }
        val v2:CardView=findViewById(R.id.cvew2)
        v2.setOnClickListener{
            val intent=Intent(this,Questions_Activity2::class.java)
            startActivity(intent)
        }

}
}