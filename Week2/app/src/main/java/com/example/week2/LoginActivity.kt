package com.example.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setEvent();
    }

    private fun setEvent() {
       txt_sign_up.setOnClickListener {
           val intent=Intent(this,SignUpActivity::class.java)
           startActivity(intent);
       }
    }
}
