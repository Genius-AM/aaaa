package com.example.aaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activSix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activ_six)
    }

    fun onClickSeven(view: View)
    {
        var intent = Intent(this, MainActivitySeven::class.java)
        startActivity(intent)
    }
}