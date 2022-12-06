package com.example.aaaa

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.example.aaaa.databinding.ActivityOneWorkBinding
import android.content.Intent as Intent

class OneWork : AppCompatActivity() {
    private lateinit var binding: ActivityOneWorkBinding
    private var timer: CountDownTimer? = null
    private var finish = "Finish"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneWorkBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClick(view: View) {
        val intent = Intent(this, TwoWork::class.java)
        startActivity(intent)

    }
}