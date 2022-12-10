package com.example.aaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.aaaa.databinding.ActivityOneWorkBinding

class OneWork : AppCompatActivity() {
    private lateinit var binding: ActivityOneWorkBinding
    private var timer: CountDownTimer? = null
    private var finish = "Finish"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneWorkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            bStart.setOnClickListener {
                onClick()
            }
        }
    }

     fun onClick() {
        var intent = Intent(this, TwoWork::class.java)
         startActivity(intent);
    }
}