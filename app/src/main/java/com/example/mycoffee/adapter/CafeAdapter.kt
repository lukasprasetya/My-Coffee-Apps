package com.example.mycoffee.adapter

import CafeModel
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mycoffee.R

class CafeAdapter(private val listCafe: ArrayList<CafeModel>,
                    private val listener : OnCafeClickListener) :
    RecyclerView.Adapter<CafeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CafeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cafe, parent, false)
        return CafeViewHolder(view)
    }

    override fun getItemCount(): Int = listCafe.size

    override fun onBindViewHolder(holder: CafeViewHolder, position: Int) {

        holder.bindCafe(listCafe[position], listener, position)
    }
}

class CafeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvName: TextView = view.findViewById(R.id.tv_cafe_name)
    private val tvSubname: TextView = view.findViewById(R.id.tv_cafe_subname)
    private val imgPhoto: ImageView = view.findViewById(R.id.civ_cafe)

    fun bindCafe(cafe: CafeModel, listener: OnCafeClickListener, pos : Int) {
        tvName.text = cafe.name
        tvSubname.text = cafe.subname
        Glide.with(itemView.context)
            .load(cafe.photo)
            .apply(RequestOptions().override(90,90))
            .into(imgPhoto)

        itemView.setOnClickListener {
            listener.onCafeClick(cafe)
        }
    }
}

interface OnCafeClickListener {
    fun onCafeClick(cafe: CafeModel)
}