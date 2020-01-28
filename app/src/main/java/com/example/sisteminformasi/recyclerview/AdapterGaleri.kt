package com.example.sisteminformasi.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.example.sisteminformasi.R
import kotlinx.android.synthetic.main.item_adapter_galeri.view.*


class AdapterGaleri (private val daftarGambar : ArrayList<String>) : RecyclerView.Adapter<AdapterGaleri.ViewHolder>(){
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
            Toast.makeText(holder.itemView.context, daftarGambar.get(position),
                Toast.LENGTH_SHORT).show()


        }
}

}