package com.example.sisteminformasi.recyclerview

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.example.sisteminformasi.R
import kotlinx.android.synthetic.main.item_adapter_galeri.view.*


class AdapterGaleri (private val daftarGambar : ArrayList<String>,private val judulGambar : ArrayList<String>) : RecyclerView.Adapter<AdapterGaleri.ViewHolder>(){
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val gambar=itemView.gambarGaleri
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_adapter_galeri, parent, false))
    }

    override fun getItemCount(): Int {
    return daftarGambar.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val progress = CircularProgressDrawable(holder.itemView.context)
        Glide.with(holder.itemView.context).load(daftarGambar.get(position))
            .into(holder.gambar)

        holder.itemView.setOnClickListener {
//            Toast.makeText(
//                holder.itemView.context, daftarGambar.get(position),
//                Toast.LENGTH_SHORT
//            ).show()
            imagePreview(daftarGambar.get(position),holder.itemView.context, judulGambar.get(position))
        }
    }

    private fun imagePreview(url : String, context: Context, judul: String) {
        val view = LayoutInflater.from(context).inflate(R.layout.zoomstruktur, null)
        val imageViewZoom = view.findViewById<ImageView>(R.id.strukturzoom)

        val judulzoom = view.findViewById<TextView>(R.id.judul)
        judulzoom.text=judul
        Glide.with(context).load(url).into(imageViewZoom)

        val alert = AlertDialog.Builder(context)
        alert.setView(view)
        alert.setPositiveButton("TUTUP") { dialog, which ->
            dialog.dismiss()
        }
        alert.create().show()
    }
}