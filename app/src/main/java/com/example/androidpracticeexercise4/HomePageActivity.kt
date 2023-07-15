package com.example.androidpracticeexercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidpracticeexercise4.databinding.ActivityHomePageBinding

class HomePageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName = intent.getStringExtra("username")
        binding.txtUserName.text = userName

    }
}