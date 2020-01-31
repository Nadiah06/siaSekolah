package com.example.sisteminformasi.profil

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import com.example.sisteminformasi.home.Home
import kotlinx.android.synthetic.main.activity_struktur_pimpinan.*
import kotlinx.android.synthetic.main.zoomstruktur.*

class StrukturPimpinan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_struktur_pimpinan)

        layout_struktur.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }}
}
