package com.example.sisteminformasi.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import kotlinx.android.synthetic.main.activity_galeri.*

class Galeri : AppCompatActivity() {

    private val imageList= arrayListOf(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdY22mYduID12Uft_b7C5B2pmuvGVS4WJULVXX4et6yWAenVRoEg&s.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTeYVnu3wtIh0B9H8Pp2bnHyV4MVEFOW35WWTLCWHtbBJHiGmH&s.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQImaop6E6l0EVCEiXgLKlU9MaC1R0GHQsYUn3QvtcQ8C61QQDtGg&s.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJoLNoT_FqXWT60nKkTyq918EwERcBeKzUJ6VEusFB2Yj41I_L&s.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGCSL2KXIqJrqYj9rwvUmhoFeHwHjv4UmtbPXaOyMM2jSWOQPsyQ&s.jpg",
        "http://2.bp.blogspot.com/_fdTIPL5uMUU/Se_eH9JNTiI/AAAAAAAAANg/x9pPj6j7hag/S483/h10.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS03lyQOyjG01hCXjqyrW8HxZaCsjE1cRypYKUxYUotvUexTcd8&s.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTlnuwzG6BJT6nd53940iD1o5_ALrJIqcvWjq3vZOXS0T9mQ-Ay&s.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQK3Fz8HofGNuAS5eFfg1F_7ST_CgpLJYVLsGziKafpT7beGoDs&s.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1ucctSJpD-0Ain7p9d-gO1vs9lQDY0kK_AMX0Fr_s5SU1Rdop&s.jpg"
        )

    private val judulzoom = arrayListOf(
        "Olahraga Sepak Bola",
        "PMR SMADA",
        "Marching Band",
        "Halaman Depan SMADA",
        "Pramuka",
        "Baris berbaris pramuka",
        "Jalan santai",
        "HUT Smada",
        "Kegiatan Rohis : Gema Muharram Fair",
        "Gugus Aswawarman"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        val adapter = AdapterGaleri (imageList,judulzoom)
        galeri.adapter = adapter

    }
}
