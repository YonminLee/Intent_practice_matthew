package com.example.intent_practice_matthew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ohter.*

class OhterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ohter)

        returnToMainBtn.setOnClickListener {

//            val myIntnet = Intent(this, MainActivity::class.java)
//            startActivity(myIntnet)

            finish()

//            이전화면으로 복귀됨. 덮어써지는게 아님.



        }
    }
}