package com.example.quizfun

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.quizfun.databinding.ActivityQuestionBinding
import com.example.quizfun.databinding.ActivityQuestions2Binding

class Questions_Activity2 : AppCompatActivity(), View.OnClickListener{

    lateinit var binding: ActivityQuestions2Binding


    private var mCurrentPosition:Int=1
    private var mQuestionList:ArrayList<Question>?=null
    private var mSelectedOptionPosition:Int=0
    private var mScore:Int=0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQuestions2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
        mQuestionList=Constants2.getQues()

        setQuestion()

        binding.button.setOnClickListener(this)
        binding.imageView.rotation=90f

    }

    private fun setQuestion(){

        val question= mQuestionList!![mCurrentPosition-1]
        defaultOptionsView()
        if(mCurrentPosition==mQuestionList!!.size){
            binding.button.text="Finish"
        }

        binding.question.text= question.question    //textview for question
        binding.option1.text=question.option1        //textviews for options 1 to 4
        binding.option2.text=question.option2
        binding.option3.text=question.option3
        binding.option4.text=question.option4
        binding.imageView3.setImageResource(question.image)
        binding.progressBar.progress=mCurrentPosition
        binding.tvProgress.text="$mCurrentPosition"+"/"+binding.progressBar.max
    }

    private fun defaultOptionsView(){



        val options=ArrayList<TextView>()
        options.add(0,binding.option1)
        options.add(1,binding.option2)
        options.add(2,binding.option3)
        options.add(3,binding.option4)

        for (option in options){
            option.setTextColor(Color.parseColor("#000000"))
            option.setTextAppearance(applicationContext, Typeface.NORMAL)
            option.background= ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }



    private fun selectedOptionsView(tv: TextView, selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition=selectedOptionNum

        tv.setTextColor(Color.parseColor("#000000"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background= ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(v: View?) {
        val question= mQuestionList!![mCurrentPosition-1]

        when(v?.id){
            R.id.option1 ->{
                selectedOptionsView(binding.option1,1)
            }
            R.id.option2 ->{
                selectedOptionsView(binding.option2,2)
            }
            R.id.option3 ->{
                selectedOptionsView(binding.option3,3)
            }
            R.id.option4 ->{
                selectedOptionsView(binding.option4,4)
            }

            R.id.button->{

                if(mSelectedOptionPosition==question.correctOpt){
                    mScore+=10
                }

                if(mCurrentPosition==mQuestionList!!.size){
                    val intent= Intent(this,Result2::class.java)
                    intent.putExtra(Constants.SCORE,mScore)
                    startActivity(intent)
                    finish()
                }

                mCurrentPosition++
                setQuestion()
            }

        }

    }
}