package com.example.lesson_7_homework_month_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_7_homework_month_3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val musicName = intent.getStringExtra("musicName")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = musicName

    }
}