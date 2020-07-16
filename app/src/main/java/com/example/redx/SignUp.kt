package com.example.redx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val button = findViewById<Button>(R.id.Loginlink)
        button.setOnClickListener {
            val intent = Intent(this,SignIn::class.java)
            startActivity(intent)
        }





    }



}

