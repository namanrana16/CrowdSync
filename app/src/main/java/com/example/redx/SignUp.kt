package com.example.redx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import com.example.redx.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
private lateinit var binding3 : ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding3 = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding3.root
        setContentView(view)
        val button = findViewById<Button>(R.id.Loginlink)
        button.setOnClickListener {
            val intent = Intent(this,SignIn::class.java)
            startActivity(intent)
        }





    }



}

