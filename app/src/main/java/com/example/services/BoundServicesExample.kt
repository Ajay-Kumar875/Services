package com.example.services

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BoundServicesExample : AppCompatActivity() {

    lateinit var start:Button
    lateinit var stop:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bound_services_example)

        start=findViewById(R.id.startButton)
        stop=findViewById(R.id.stopButton)

        start.setOnClickListener {
            startService(Intent(this,NewService::class.java))
        }
        stop.setOnClickListener {
            stopService(Intent(this,NewService::class.java))
        }
    }
}