package com.example.aaaa

import android.content.Intent
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
        binding.apply {
            bStart2.setOnClickListener {
                onClickTwo()
            }
        }
    }

    fun onClickTwo() {
        var intent = Intent(this, ThreWork::class.java)
        startActivity(intent);
    }
}
