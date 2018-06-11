package com.bmpl.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class CustomAdapter(list: Array<String>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>(){

    var arrayData = list

    class CustomViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var textView : TextView = view.findViewById(R.id.textView1)
    }

    // this
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomAdapter.CustomViewHolder{
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.custom_view, parent
        , false)

        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayData.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        holder!!.textView.text = arrayData[position]
    }
}