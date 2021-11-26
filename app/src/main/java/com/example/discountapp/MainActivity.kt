package com.example.discountapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.discountapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getSupportActionBar()?.hide();

        binding.przypomnijTxt.setOnClickListener() {
            var remind: Intent = Intent(applicationContext, remindPassword::class.java)
            startActivity(remind)
        }
        binding.mainSingUpTxt.setOnClickListener() {
            var register: Intent = Intent(applicationContext, Register::class.java)
            startActivity(register)
        }
        val goToMainSite: Intent = Intent(applicationContext, Products::class.java)

        binding.LgnBtn.setOnClickListener() {
            if (binding.lgnMail.getText().toString().equals("admin")&&binding.lgnPassword.getText().toString().equals("admin")) {

                startActivity(goToMainSite)

            } else {

                    binding.badLogin.isVisible = true

            }


        }
    }
}
