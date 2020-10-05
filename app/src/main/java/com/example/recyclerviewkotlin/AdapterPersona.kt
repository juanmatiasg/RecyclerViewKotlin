package com.example.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class AdapterPersona:RecyclerView.Adapter<ViewHolder>() {
    var listaDePersona:MutableList<Persona> = mutableListOf()
    lateinit var context: Context

    fun AdapterPersona(listaDePersona:MutableList<Persona>){
        this.listaDePersona = listaDePersona
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_persona,parent,false))
    }

    override fun getItemCount(): Int {
        return this.listaDePersona.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = this.listaDePersona.get(position)
        holder.nombre.setText(item.Nombre.toString())
        holder.apellido.setText(item.Apellido.toString())
        holder.photo.loadUrl(item.Photo)
    }

    fun ImageView.loadUrl(url:String){
        Picasso.get().load(url).into(this)
    }


}

