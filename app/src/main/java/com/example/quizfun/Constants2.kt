package com.example.quizfun

object Constants2 {
    const val SCORE:String="Score"

    var questionList=ArrayList<Question>()
    fun getQues():ArrayList<Question>{
        val quest1=Question(1,"Which cricketer has the most double centuries in Test Cricket?",
            "Don Bradman","Sachin Tendulkar","Kumar Sangakkara","Brian Lara",1,R.drawable.a)
        questionList.add(quest1)

        val quest2=Question(2,"Which cricketer has taken the most wickets in ODI cricket?",
                            "Anil Kumble","M Murlitharan","Wasim Akram","Alan Donald",2,R.drawable.b)
        questionList.add(quest2)

        val quest3=Question(3,"Who was the Man of the match , for guiding his team to achieve the highest ever ODI chase?",
            "Virat Kohli","Hershelle Gibbs","Sananth Jaisurya","Chris Gayle",2,R.drawable.c)
        questionList.add(quest3)

        val quest4=Question(4, "Which team has won the most ICC trophies in the previous decade(2010-2020)?",
            "India","England","West Indies","Australia",3,R.drawable.d)
        questionList.add(quest4)

        val quest5=Question(5,"Which  cricketer has the most runs in IPL?",
            "AB de Villiers","Chris Gayle","David Warner","Virat Kohli",4,R.drawable.e)
        questionList.add(quest5)

        return questionList

    }
}