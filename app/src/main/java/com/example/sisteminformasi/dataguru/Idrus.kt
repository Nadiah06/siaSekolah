package com.example.sisteminformasi.dataguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home
import kotlinx.android.synthetic.main.activity_idrus.*

class Idrus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idrus)

        layout_idrus.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
