package com.example.aaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class fiveClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_class)
    }

    fun onClickFive(view: View) {
        val intent = Intent(this, activSix::class.java)
        startActivity(intent)
    }
}