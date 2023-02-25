package com.example.quizapp.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.quizapp.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_ui_activity)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        val mUserName = intent.getStringExtra(Constants.USER_NAME)
        val mScore = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val mTotalScore = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        tvName.text = mUserName
        tvScore.text = "Your score is $mScore out of $mTotalScore "

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}