package com.example.aaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.aaaa.databinding.ActivityOneWorkBinding
import com.example.aaaa.databinding.ActivityTwoWorkBinding

class TwoWork : AppCompatActivity() {
    private lateinit var binding: ActivityTwoWorkBinding
    private var timer: CountDownTimer? = null
    private var finish = "Finish"
    private var y = 30
    var i = y.inc().toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoWorkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fun timeStrToSeconds(str: String): Int {
            val parts = str.split(":")
            var result = 0
            for (part in parts) {
                val number = part.toInt()
                result = result * 60 + number
            }
            return result
        }
    }

     fun onClickTwo() {
        object : CountDownTimer(30000, 1) {
            override fun onTick(remaining: Long) {
                binding.textView7.text = println( i+1.toString()).toString()

            }

            override fun onFinish() {
                setContentView(R.layout.activity_thre_work)
            }
        }.start()
    }
}
