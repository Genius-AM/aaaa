package com.example.aaaa

import android.annotation.SuppressLint
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
                startCountDownTimer(40000)
            }
            bStop.setOnClickListener {
                 stopCountDownTimer()
            }
        }
    }

    private fun startCountDownTimer(timeMillis: Long) {

        timer = object : CountDownTimer(timeMillis, 10) {
            override fun onTick(timeM: Long) {
                binding.tvTimer.text = timeM.toString()
            }

            override fun onFinish() {
                setContentView(R.layout.activity_two_work)
            }
        }.start()
    }

    private fun nextStartWork() {
        this.startCountDownTimer(20000)

        setContentView(R.layout.fragment_first)
    }

    private fun stopCountDownTimer() {
        timer?.cancel()
    }

}