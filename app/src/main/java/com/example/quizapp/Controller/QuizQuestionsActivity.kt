package com.example.quizapp.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.quizapp.R

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val qutionsList= Constants.getQuestions()
        Log.i("QuestionList size is: ","${qutionsList.size}")
    }
}