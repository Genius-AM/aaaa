package com.example.aaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aaaa.R

class MainActivityEnth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_enth)
    }

    fun onClickEnth(view: View) {
        val intent = Intent(this, OneWork::class.java)
        startActivity(intent)
    }
}