package com.example.sisteminformasi.profil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisteminformasi.R
import kotlinx.android.synthetic.main.activity_profil.*

class Profil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        bt_visimisi.setOnClickListener {
            startActivity(Intent(this, VisiMisi::class.java))
        }
        bt_sejarah.setOnClickListener {
            startActivity(Intent(this,Sejarah::class.java))
        }
        bt_pimpinan.setOnClickListener {
            startActivity(Intent(this, StrukturPimpinan::class.java))
        }
    }
}
