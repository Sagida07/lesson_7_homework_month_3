package com.example.lesson_7_homework_month_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_1,  FragmentSongs()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_2,  FragmentSongsList()).commit()
    }
}