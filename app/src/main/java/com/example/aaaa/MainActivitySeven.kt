package com.example.aaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aaaa.R
import android.content.Intent
import android.view.View

class MainActivitySeven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_seven)
    }

     fun onClickEnth(view: View) {
        var intent = Intent(this, MainActivityEnth::class.java)
         startActivity(intent)
    }
}