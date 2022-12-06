package com.example.aaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThreWork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thre_work)
    }

    fun onClick(view: View) {
        val intent = Intent(this, MainActivityFore::class.java)
        startActivity(intent)

    }

}