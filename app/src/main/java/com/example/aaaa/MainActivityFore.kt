package com.example.aaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivityFore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fore)
    }
    fun onClick(view: View){
        val intent = Intent(this, fiveClass::class.java)
        startActivity(intent)

    }
}