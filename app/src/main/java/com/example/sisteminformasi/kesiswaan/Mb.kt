package com.example.sisteminformasi.kesiswaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home
import kotlinx.android.synthetic.main.activity_mb.*

class Mb : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mb)

        button_mb.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
