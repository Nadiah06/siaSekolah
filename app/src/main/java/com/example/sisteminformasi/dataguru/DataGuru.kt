package com.example.sisteminformasi.dataguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import kotlinx.android.synthetic.main.activity_data_guru.*

class DataGuru : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_guru)

        gr_desi.setOnClickListener {
            startActivity(Intent(this, Desi::class.java))
        }
        gr_idrus.setOnClickListener {
            startActivity(Intent(this, Idrus::class.java))
        }
        gr_juwa.setOnClickListener {
            startActivity(Intent(this, Juwarningsih::class.java))
        }
        gr_kartini.setOnClickListener {
            startActivity(Intent(this, Kartina::class.java))
        }
        gr_sudarsono.setOnClickListener {
            startActivity(Intent(this, Sudarsono::class.java))
        }
        gr_bagus.setOnClickListener {
            startActivity(Intent(this,Bagus::class.java))
        }
        gr_susi.setOnClickListener {
            startActivity(Intent(this, Susi::class.java))
        }
        gr_titik.setOnClickListener {
            startActivity(Intent(this,Titik::class.java))
        }
        gr_zahra.setOnClickListener {
            startActivity(Intent(this, Sahara::class.java))
        }
        gr_upaya.setOnClickListener {
            startActivity(Intent(this, Upayani::class.java))
        }
    }
}
