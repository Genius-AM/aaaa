package com.example.aaaa

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

    private fun onClick() {
        timer?.cancel()
        object : CountDownTimer(3, 1) {
            override fun onTick(remaining: Long) {
                binding.tvTimer.text = remaining.toString()

            }

            override fun onFinish() {
                setContentView(R.layout.activity_two_work)
            }
        }.start()
    }
}