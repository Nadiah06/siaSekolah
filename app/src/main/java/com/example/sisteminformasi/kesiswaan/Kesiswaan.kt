package com.example.sisteminformasi.kesiswaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import kotlinx.android.synthetic.main.activity_kesiswaan.*

class Kesiswaan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kesiswaan)

        osis.setOnClickListener {
            startActivity(Intent(this, Osis::class.java))
        }
        mb.setOnClickListener {
            startActivity(Intent(this, Mb::class.java))
        }
        paskibraka.setOnClickListener {
            startActivity(Intent(this, Paskibraka::class.java))
        }
        ektrakulikuler.setOnClickListener {
            startActivity(Intent(this, XtraKulikuler::class.java))
        }
    }
}
