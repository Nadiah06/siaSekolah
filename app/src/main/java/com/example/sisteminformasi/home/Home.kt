package com.example.sisteminformasi.home

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.sisteminformasi.R
import com.example.sisteminformasi.dataguru.DataGuru
import com.example.sisteminformasi.kesiswaan.Kesiswaan
import com.example.sisteminformasi.maps.Lokasi
import com.example.sisteminformasi.pendaftaran.Pendaftaran
import com.example.sisteminformasi.profil.Profil
import com.example.sisteminformasi.recyclerview.Galeri
import com.example.sisteminformasi.tentang.Tentang
import com.example.sisteminformasi.video.Video
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.zoomstruktur.*

class Home : AppCompatActivity(), View.OnClickListener {
    lateinit var carouselView: CarouselView
    val banner = intArrayOf(
        R.drawable.satu,
        R.drawable.dua,
        R.drawable.empat
    )
//
//    lateinit var profil : Button
//    lateinit var galeri : Button
//    lateinit var guru : Button
//    lateinit var maps : Button
//    lateinit var daftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        carouselView = findViewById(R.id.carouselView)
        carouselView.setPageCount(banner.size)
        carouselView.setImageListener { position, imageView ->
            Glide.with(this@Home).load(banner[position]).into(imageView)
        }


//        profil = findViewById(R.id.button_profil)
//        galeri = findViewById(R.id.buttpn_galeri)
//        guru = findViewById(R.id.button_guru)
//        maps = findViewById(R.id.button_maps)
//        daftar = findViewById(R.id.button_pendaftaran)
//
//        profil.setOnClickListener(this)
//        galeri.setOnClickListener(this)
//        guru.setOnClickListener(this)
//        maps.setOnClickListener(this)
//        daftar.setOnClickListener(this)
//    }
//
//    override fun onClick(v: View?) {
//        when(v!!.id){
//            R.id.button_profil -> {
//                 val intent= Intent(this, Profil::class.java)
//        startActivity(intent)
//            }
//            R.id.buttpn_galeri -> {
//                val intent = Intent (this, Galeri::class.java)
//                startActivity(intent)
//            }
//            R.id.button_guru -> {
//                val intent= Intent (this, DataGuru::class.java)
//                startActivity(intent)
//            }
//            R.id.button_maps -> {
//                val intent= Intent (this, Lokasi::class.java)
//                startActivity(intent)
//            }
//            R.id.button_pendaftaran -> {
//                val daftar = Intent (this, Pendaftaran::class.java)
//                daftar.putExtra("url", "https://facebook.com")
//                startActivity(daftar)
//                return
//            }
//        }

        buttpn_galeri.setOnClickListener {
            startActivity(Intent(this@Home, Galeri::class.java))
        }

        button_profil.setOnClickListener {
            startActivity(Intent(this@Home, Profil::class.java))
        }
        button_guru.setOnClickListener {
            startActivity(Intent(this@Home, DataGuru::class.java))
        }
        button_maps.setOnClickListener {
            val detail = Intent(this@Home, Lokasi::class.java)
            detail.putExtra("judul", "SMA NEGERI 2 TARAKAN")
            detail.putExtra("deskripsi", "Jl. Gn. Kerinci No.Kelurahan, Kp. Enam, Tarakan Tim., Kota Tarakan, Kalimantan Utara 77123")
            detail.putExtra("lat", 3.3083182)
            detail.putExtra("lon", 117.6224579)
            this@Home.startActivity(detail)
        }
        button_pendaftaran.setOnClickListener {
            val url = "https://www.sman2tarakan.sch.id/"
            val webView = Intent(Intent.ACTION_VIEW)
            webView.data = Uri.parse(url)
            startActivity(webView)

        }
        button_kesiswaan.setOnClickListener {
            startActivity(Intent(this@Home, Kesiswaan::class.java))
        }

        button_video.setOnClickListener {
            startActivity(Intent(this@Home, Video::class.java))

        }
        button_tentang.setOnClickListener {
            startActivity(Intent(this@Home, Tentang::class.java))
        }

    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}