package com.example.sisteminformasi.dataguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home
import kotlinx.android.synthetic.main.activity_susi.*

class Susi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_susi)

        layout_susi.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
