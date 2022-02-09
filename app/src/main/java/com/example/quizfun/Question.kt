package com.example.quizfun

data class Question (
    val id:Int,
    val question:String,
    val option1:String,
    val option2:String,
    val option3:String,
    val option4:String,
    val correctOpt:Int,
    val image:Int
    )