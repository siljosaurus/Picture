package com.example.siljemfl_in2000_oblig1

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.element.view.*


class ListAdapter(val elementer: MutableList<Element>): RecyclerView.Adapter<ViewHolder>() {


    override fun getItemCount(): Int {
        return elementer.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, ViewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)

        val cellForRow = layoutInflater.inflate(R.layout.activity_list, parent, false)

        return ViewHolder(cellForRow)
    }


    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val element: Element = elementer[p1]
        p0.tittel.text = element.title
        p0.description.text = element.description

        // val titler = elementer.get(position)
        // holder?.view?.element_textView_title?.text = "LooooolllLLL"
    }


}

class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    val tittel = view.findViewById<TextView>(R.id.element_textView_title)
    val description = view.findViewById<TextView>(R.id.element_textView_Description)
}