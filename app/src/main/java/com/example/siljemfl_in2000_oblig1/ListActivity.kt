package com.example.siljemfl_in2000_oblig1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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



        // Opprette Adapter til RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.list_recycleView)
        recyclerView.adapter = ListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

    }
}
