package com.example.aaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.aaaa.databinding.ActivityTwoWorkBinding
import android.content.Intent as Intent

class TwoWork : AppCompatActivity() {
    private lateinit var bindings: ActivityTwoWorkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = ActivityTwoWorkBinding.inflate(layoutInflater)
        setContentView(bindings.root)
    }

    fun btnClick(view: View) {
        val intent = Intent(this, ThreWork::class.java)
        startActivity(intent)
    }
}