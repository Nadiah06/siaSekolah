package com.example.sisteminformasi.kesiswaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home
import kotlinx.android.synthetic.main.activity_paskibraka.*

class Paskibraka : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paskibraka)

        button_paskibraka.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
