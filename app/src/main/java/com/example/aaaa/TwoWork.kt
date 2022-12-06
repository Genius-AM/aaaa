package com.example.aaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.aaaa.databinding.ActivityTwoWorkBinding

class TwoWork : AppCompatActivity() {
    private lateinit var bindings: ActivityTwoWorkBinding
    private var timer: CountDownTimer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = ActivityTwoWorkBinding.inflate(layoutInflater)
        setContentView(bindings.root)

        bindings.apply {
            bTwoStart.setOnClickListener {
                startCountDownimer(40000)
            }
            bStop.setOnClickListener {
                stopCountDownTimer()
            }
        }
    }

    private fun startCountDownimer(timeMillis: Long) {

        timer = object : CountDownTimer(timeMillis, 10) {
            override fun onTick(timeM: Long) {
                bindings.tvTwoTimer.text = timeM.toString()
            }

            override fun onFinish() {

            }
        }.start()
    }

    private fun stopCountDownTimer() {
        timer?.cancel()
    }
}