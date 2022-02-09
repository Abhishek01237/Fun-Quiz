package com.example.quizfun

object Constants {

    const val SCORE:String="Score"

    var questionList=ArrayList<Question>()
    fun getQues():ArrayList<Question>{
        val quest1=Question(1,"What are your views on caste based reservation?",
            "I think reservation is important and beneficial for the lower castes for their upliftment and should continue","I believe it is important to review to know how much it has actually helped,though it is necessary upto some extent","I believe reservation has created further caste- based divide,focus should be to provide more opportunities to lower-castes,than reservation","Reservation is completely unjustifiable, based on vote-bank politics and must be abolished whatsoever",1,R.drawable.img1)
        questionList.add(quest1)

        val quest2=Question(2,"Should marital rapes be criminalised in India?",
            "Definitely! It is a crime,and it's sad that a women facing marital rape cannot be protected by laws in the 21st century","I think the crime in itself is horrific, but i believe more research is needed before implementing it rightaway ","Marital rape is a serious crime,but i dont know how marital rape can ever be proven, and how it'll be made sure that the women is not trying to falsely accuse her husband","No! Marriage is a pious union in which physical relationship is important punishing a husband what he is entitled to, is outrageous and illogical",1,R.drawable.img2)
        questionList.add(quest2)

        val quest3=Question(3,"Are you religious?",
            "I am an atheist/agnostic and so obviously adhere to no religious practices","I follow my religion,though i rarely pray","Yes ,and i do my religious practices often and pray too.","I am proud to be born in my religion and i never miss any chance to give time to my religion's practices",1,R.drawable.img3)
        questionList.add(quest3)

        val quest4=Question(4, "Are Indian muslims too much insecure today?",
            "No doubt!The rise of hindutva has threatened Indian muslims","Hindutva extremism has risen but majority of indians(including hindus) are tolerant and that makes India beautiful ","I think an atmosphere has been created that muslims are insecure today,and its not the ground reality whatsoever","If they feel so they are welcome to go to Pakistan, and actually it's the hindus that are at disadvantage due to minority appeasement!",1,R.drawable.img4)
        questionList.add(quest4)

        val quest5=Question(5,"Do you believe that freedom of speech should have limitations?",
            "No! Freedom of speech should be absolute, even if someone disagrees with the views expressed","I think some form of limitations are required to maintain social peace and not over-offend any community","Limitations are definitely required,for example, those offending any religion/God must be punished","Freedom of speech is a western virus, and no one should be allowed to say anything what they wish if their views are offensive/wrong",1,R.drawable.img5)
        questionList.add(quest5)

        return questionList

    }
}