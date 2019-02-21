package com.example.siljemfl_in2000_oblig1

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setTitle("List View")


        // Datastruktur for å lagre elementene, arrayList eller mutableList

        val datastruktur = ArrayList<String>("Tittel 1", "Tittel 2", "Tittel 3")

        // Opprette Adapter til RecyclerView

        list_recycleView.layoutManager = LinearLayoutManager(this)
        list_recycleView.adapter = ListAdapter(datastruktur)




        // Implementer setOnClickListener til Floating Action Button for å legge til nye elementer i listen

        // Bruk en AlertDialog for å samle input fra bruker, for så å legge til et nytt element i listen


    }
}
