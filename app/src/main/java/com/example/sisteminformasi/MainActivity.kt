package com.example.sisteminformasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.dataguru.DataGuru
import com.example.sisteminformasi.home.Home
import com.example.sisteminformasi.maps.Lokasi
import com.example.sisteminformasi.profil.Profil
import com.example.sisteminformasi.recyclerview.Galeri
import kotlinx.android.synthetic.main.activity_galeri.*
import kotlinx.android.synthetic.main.activity_lokasi.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        activity ke activity
        val intent= Intent(this, Home::class.java)
        startActivity(intent)

//
//        buttpn_galeri.setOnClickListener {
//            startActivity(Intent(this@MainActivity, Galeri::class.java ))
//        }
//        button_profil.setOnClickListener {
//            startActivity(Intent(this@MainActivity, Profil::class.java))
//        }
//        button_guru.setOnClickListener {
//            startActivity(Intent(this@MainActivity, DataGuru::class.java))
//        }
//        button_maps.setOnClickListener {
//           supportFragmentManager?.beginTransaction()
//                ?.replace(R.id.container_utama, Lokasi())?.commit()
//        }
//
        }
        }

