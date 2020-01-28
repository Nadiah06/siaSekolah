package com.example.sisteminformasi.dataguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home
import kotlinx.android.synthetic.main.activity_data_guru.*
import kotlinx.android.synthetic.main.activity_desi.*

class Desi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desi)

        layout_desi.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
