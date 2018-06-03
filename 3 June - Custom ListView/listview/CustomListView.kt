package com.bmpl.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomListView(mainActivity: MainActivity, data: Array<String>, profile: Array<Int>) : BaseAdapter() {

    var dataArray = data
    var profileImages = profile

//    class ViewHolder{  // downcasting --> TextView and ImageView
//        var textView
//        var imageView
//    }

    //Layout inflater --> layout return

    var layoutInflater : LayoutInflater = mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var view : View = layoutInflater.inflate(R.layout.custom_listview, p2, false)

        var textView  = view.findViewById<TextView>(R.id.textView)
        var imageView  = view.findViewById<ImageView>(R.id.imageView)

        textView.text = dataArray[p0]
        imageView.setImageResource(profileImages[p0])

        return view
    }

    override fun getItem(index: Int): Any {
        return dataArray[index]
    }

    override fun getItemId(p0: Int): Long {
        return profileImages[p0].toLong()           // cupcake.toLong() --> NumberFormatException
    }

    override fun getCount(): Int {
        return profileImages.size // always start from 1
    }
}