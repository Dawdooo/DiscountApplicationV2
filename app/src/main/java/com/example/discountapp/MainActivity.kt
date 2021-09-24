package com.example.discountapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.discountapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.przypomnijTxt.setOnClickListener() {
            var remind: Intent = Intent(applicationContext, remindPassword::class.java)
            startActivity(remind)
        }
        binding.mainSingUpTxt.setOnClickListener() {
            var register: Intent = Intent(applicationContext, Register::class.java)
            startActivity(register)
        }
    }
}