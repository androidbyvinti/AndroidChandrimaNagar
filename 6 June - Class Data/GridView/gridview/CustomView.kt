package com.bmpl.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

class CustomView(mainActivity: MainActivity, images: Array<String>) : BaseAdapter() {

    var imagesArray = images

    var layoutInflater = mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    var mainActivity = mainActivity

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = layoutInflater.inflate(R.layout.custom_view, null, false)

        var imageView = view.findViewById<ImageView>(R.id.imageView)

        Glide.with(mainActivity)
                .load(imagesArray[p0])
                .into(imageView)

        return view
    }

    override fun getItem(p0: Int): Any {
        return imagesArray[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return imagesArray.size
    }
}