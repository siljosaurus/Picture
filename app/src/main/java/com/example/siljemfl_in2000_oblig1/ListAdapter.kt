package com.example.siljemfl_in2000_oblig1

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.element.view.*


class ListAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val datastruktur = listOf("Tittel 1", "Tittel 2", "Tittel 3")


    override fun getItemCount(): Int {
        return datastruktur.size
    }
    
    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        val titler = datastruktur.get(position)

        holder?.view?.element_textView_title?.text = "LooooolllLLL"
    }

    
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)

        val cellForRow = layoutInflater.inflate(R.layout.element, parent, false)

        return CustomViewHolder(cellForRow)
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view)        {
    
}