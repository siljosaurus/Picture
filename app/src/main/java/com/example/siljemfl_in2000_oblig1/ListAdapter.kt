package com.example.siljemfl_in2000_oblig1

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.element.view.*



class ListAdapter: RecyclerView.Adapter<ViewHolder>() {

    val elementTitles = arrayListOf("elm 1", "elm 2")
    val elementDescriptions = arrayListOf("This is the description for element 1", "This is the description for element 2")

    override fun getItemCount(): Int {
        return elementTitles.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, ViewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(p0?.context)
        val cellForRow = layoutInflater.inflate(R.layout.element, p0, false)
        return ViewHolder(cellForRow)
    }

    override fun onBindViewHolder(p0: ViewHolder, position: Int) {
        val elementTitle = elementTitles.get(position)
        p0?.view?.element_textView_title?.text = elementTitle

        val elementDescription = elementDescriptions.get(position)
        p0?.view?.element_textView_description?.text = elementDescription
    }



    fun update() {


        notifyDataSetChanged()
    }

}

class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}

