package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var listaDePersona:MutableList<Persona>
    lateinit var mRecyclerView:RecyclerView
    var mAdapterPersona:AdapterPersona= AdapterPersona()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setUpRecyclerView()

        mRecyclerView = findViewById(R.id.recyclerView)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapterPersona.AdapterPersona(getPersona())
        mRecyclerView.adapter = mAdapterPersona

    }

    fun getPersona():MutableList<Persona>{
        this.listaDePersona = mutableListOf()
        this.listaDePersona.add(Persona("Walter","White","https://cflvdg.avoz.es/sc/JB-4a8dTYG0EI4JEPqzEtbrt2P4=/x/2018/01/19/00121516320542776707443/Foto/J19M7055.jpg"))
        this.listaDePersona.add(Persona("Jessy","Pinkman","https://vignette.wikia.nocookie.net/breakingbad/images/2/20/T5B_-_Jesse.jpg/revision/latest?cb=20150219153012&path-prefix=es"))
        this.listaDePersona.add(Persona("Juancito","White","https://cflvdg.avoz.es/sc/JB-4a8dTYG0EI4JEPqzEtbrt2P4=/x/2018/01/19/00121516320542776707443/Foto/J19M7055.jpg"))
        this.listaDePersona.add(Persona("Maxi","Pinkman","https://vignette.wikia.nocookie.net/breakingbad/images/2/20/T5B_-_Jesse.jpg/revision/latest?cb=20150219153012&path-prefix=es"))
        return this.listaDePersona
    }

   /* fun setUpRecyclerView(){
        mRecyclerView = findViewById(R.id.recyclerView)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapterPersona.AdapterPersona(getPersona(),this)
        mRecyclerView.adapter = mAdapterPersona
    }*/


}
