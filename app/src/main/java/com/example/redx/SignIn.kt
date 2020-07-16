package com.example.redx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



abstract class SignIn : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val button = findViewById<Button>(R.id.Signuplink)
        button.setOnClickListener {
            val intent= Intent(this,SignUp::class.java)
            startActivity(intent)
        }



        }
    }



