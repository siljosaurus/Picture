package com.example.siljemfl_in2000_oblig1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

class ListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        // Datastruktur for å lagre elementene, arrayList eller mutableList

        // Opprette Adapter til RecyclerView

        val recycle = findViewById<RecyclerView>(R.id.list_recycleView)



        // Implementer setOnClickListener til Floating Action Button for å legge til nye elementer i listen

        // Bruk en AlertDialog for å samle input fra bruker, for så å legge til et nytt element i listen


    }
}
