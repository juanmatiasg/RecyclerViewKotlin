package com.example.recyclerviewkotlin

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    var nombre = view.findViewById<TextView>(R.id.textViewNombre)
    var apellido =view.findViewById<TextView>(R.id.textViewApellido)
    var photo =view.findViewById<ImageView>(R.id.imageView)

    fun bind(persona:Persona){
        nombre.text = persona.Nombre
        apellido.text=persona.Apellido
        photo.loadUrl(persona.Photo)
    }

    fun ImageView.loadUrl(url:String){
        Picasso.get().load(url).into(this)
    }
}