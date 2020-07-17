package com.example.redx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.redx.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


lateinit var email :EditText
lateinit var password :EditText
private lateinit var auth: FirebaseAuth
private lateinit var binding: ActivitySignInBinding
   class SignIn : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val button = findViewById<Button>(R.id.Signuplink)
        button.setOnClickListener {
            val intent= Intent(this,SignUp::class.java)
            startActivity(intent)
        }



        auth = Firebase.auth
    }



       }



