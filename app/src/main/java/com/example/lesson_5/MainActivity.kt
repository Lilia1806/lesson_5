package com.example.lesson_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lesson_5_fragment.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, FirstFragment())
            .commit()
    }
}