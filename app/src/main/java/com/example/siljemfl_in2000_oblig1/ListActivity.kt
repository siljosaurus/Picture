package com.example.siljemfl_in2000_oblig1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.widget.Button
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setTitle("List")


        val adapter = ListAdapter()

        // Opprette Adapter til RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.list_recycleView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)




        val butt = findViewById<FloatingActionButton>(R.id.list_floatingActionButton)
        butt.setOnClickListener {
            adapter.elementDescriptions.add("Heeeeeei")
            adapter.elementTitles.add("påå deeeg")
            adapter.notifyItemChanged(adapter.elementDescriptions.size)
        }




    }
}
