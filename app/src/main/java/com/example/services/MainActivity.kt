package com.example.services

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnStart:Button
    lateinit var btnStop:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart=findViewById(R.id.buttonStart)
        btnStop=findViewById(R.id.buttonStop)

        btnStart.setOnClickListener {
            val startIntent= Intent(this,ForegroundService::class.java)
            startIntent.putExtra("input Extra","ForegroundService is running...")
            ContextCompat.startForegroundService(this,startIntent)
        }
        btnStop.setOnClickListener {
            val stopIntent= Intent(this,ForegroundService::class.java)
            stopService(stopIntent)
        }
    }
}