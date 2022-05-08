package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnTuma:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi =findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener{
            val intent = Intent(this,BMICalculatorActivity::class.java)
            startActivity(intent)
        }
        btnTuma= findViewById(R.id.btnTuma)
        btnTuma.setOnClickListener {
            val intent = Intent(this,sendMoney::class.java)
            startActivity(intent)
        }

    }
}