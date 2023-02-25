package com.example.quizapp.Controller

import com.example.quizapp.R

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belongs to?",
            R.drawable.us,
            "India", "Austrialia", "United State", "United Kingdome",
            3
        )
        questionsList.add(que1)
        val que2 = Question(
            2, "What country does this flag belongs to?",
            R.drawable.france,
            "India", "France", "United State", "United Kingdome",
            2
        )
        questionsList.add(que2)
        val que3 = Question(
            3, "What country does this flag belongs to?",
            R.drawable.india,
            "India", "Austrialia", "United State", "United Kingdome",
            1
        )
        questionsList.add(que3)
        val que4 = Question(
            4, "What country does this flag belongs to?",
            R.drawable.germany,
            "India", "Austrialia", "germany", "United Kingdome",
            3
        )
        questionsList.add(que4)
        val que5 = Question(
            5, "What country does this flag belongs to?",
            R.drawable.spain,
            "India", "Austrialia", "United State", "Spain",
            4
        )
        questionsList.add(que5)
        val que6 = Question(
            6, "What country does this flag belongs to?",
            R.drawable.uk,
            "India", "Austrialia", "United State", "United Kingdome",
            4
        )
        questionsList.add(que6)

        return questionsList
    }
}