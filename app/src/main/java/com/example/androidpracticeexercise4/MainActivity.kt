package com.example.androidpracticeexercise4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidpracticeexercise4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var userName:String="bernadette.dejesus"
    private var password:String="password123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val inputUserName = binding.editTxtUsername.text.toString()
            val inputPassword= binding.editTxtPassword.text.toString()
            if(isValidCredentials(inputUserName,inputPassword)){
                val message:String =inputUserName
                val intentMain = Intent(this,HomePageActivity::class.java)
                intentMain.putExtra("username",message)
                startActivity(intentMain)
                finish()
            }
            else{
                Toast.makeText(applicationContext,"Invalid username or password",Toast.LENGTH_SHORT).show()
            }

        }
    }
   private fun isValidCredentials(inputUserName:String,inputPassword:String):Boolean{
       return inputUserName==userName && inputPassword==password
    }

}