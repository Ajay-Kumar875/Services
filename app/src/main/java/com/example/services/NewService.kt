package com.example.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class NewService:Service() {

    private lateinit var player: MediaPlayer

    //execution will start on calling this method
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player=MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI)
        //providing the boolean value as true to play audio on loop
        player.setLooping(true)
        //starting the process
        player.start()
        //returns the status of the program
        return START_STICKY
    }

    //execution of function will stop on calling this method
    override fun onDestroy() {
        super.onDestroy()
        //stopping the process
        player.stop()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}