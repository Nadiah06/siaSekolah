package com.example.sisteminformasi.SplashScreen

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.sisteminformasi.MainActivity
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home

class SplashScreen : AppCompatActivity() {
    lateinit var handler : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        requestedOrientation=
            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        handler =Handler()
        handler.postDelayed(Runnable {
            var intent: Intent
            intent = Intent(
                this, Home::class.java
            )
            startActivity(intent)
            this@SplashScreen.finish()
        },3000 )
        }}
