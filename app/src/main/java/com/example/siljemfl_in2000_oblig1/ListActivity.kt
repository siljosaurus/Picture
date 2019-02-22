package com.example.siljemfl_in2000_oblig1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.EditText
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.element.view.*

class ListActivity: AppCompatActivity() {

    private val adapter = ListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setTitle("List")


        val dialog = findViewById<LinearLayout>(R.id.dialog_alert)

        // Opprette Adapter til RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.list_recycleView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        val butt = findViewById<FloatingActionButton>(R.id.list_floatingActionButton)
        butt.setOnClickListener {
            showDialog()


            return@setOnClickListener
        }
    }

    private fun showDialog() {
        val builder = AlertDialog.Builder(this)
        val inflater = this.layoutInflater
        val dialog = inflater.inflate(R.layout.dialog, null)
        builder.setView(dialog)

        val titleEditor = dialog.findViewById<EditText>(R.id.dialog_editText_title)
        val descriptionEditor = dialog.findViewById<EditText>(R.id.dialog_editText_description)

        builder.setPositiveButton("OK" ) { _, _ ->
            val inputTitle = titleEditor.text.toString()
            val inputDescription = descriptionEditor.text.toString()

            this.adapter.elementDescriptions.add(inputTitle)
            this.adapter.elementTitles.add(inputDescription)
            this.adapter.notifyItemChanged(this.adapter.elementDescriptions.size)
        }

        builder.setNegativeButton("Avbryt") {_,_ ->

        }

        val res = builder.create()
        res.show()
    }
}
