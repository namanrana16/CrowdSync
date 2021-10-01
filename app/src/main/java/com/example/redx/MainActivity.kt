package com.example.redx

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.redx.databinding.ActivityMainBinding

private lateinit var binding2: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMainBinding.inflate(layoutInflater)
        val view = binding2.root
        setContentView(view)
        Handler().postDelayed({
        val intent = Intent(this@MainActivity,HomeActivity::class.java)
        startActivity(intent)
    },2000)
}


}