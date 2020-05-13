package com.example.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterPersona:RecyclerView.Adapter<ViewHolder>() {
    var listaDePersona:MutableList<Persona> = mutableListOf()
    lateinit var context: Context

    fun AdapterPersona(listaDePersona:MutableList<Persona>,context: Context){
        this.listaDePersona = listaDePersona
        this.context=context
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
        holder.bind(item)
    }


}

