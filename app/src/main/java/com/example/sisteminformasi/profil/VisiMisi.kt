package com.example.sisteminformasi.profil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home
import kotlinx.android.synthetic.main.activity_visi_misi.*

class VisiMisi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visi_misi)

        button_visimisi.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
