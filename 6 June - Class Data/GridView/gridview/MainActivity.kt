package com.bmpl.gridview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var images = arrayOf(
            "https://i.pinimg.com/originals/19/b6/3c/19b63c6baa28dc6517ee7d620a0132a4.jpg",
            "http://www.cartoon-clipart.co/amp/images/minion2.png",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfitDCtEqWS35PfZ3srQmno7aa9vJgvwtft33cUr3Z4jnrJL9P",
            "https://www.wonderslist.com/wp-content/uploads/2017/09/Popeye-oldest-cartoon-characters.jpg",
            "http://images.clipartpanda.com/cartoon-clipart-cartoon-clipart-06.jpg",
            "https://img.buzzfeed.com/buzzfeed-static/static/enhanced/terminal01/2011/6/29/15/enhanced-buzz-15012-1309375809-34.jpg",
            "http://1.bp.blogspot.com/_VDYs6Xdg1MM/TLyQYaBzHMI/AAAAAAAAACI/boxfZK7-Wxg/s1600/kai+lan.jpg",
            "https://easydrawingguides-7512.kxcdn.com/wp-content/uploads/2017/02/How-draw-a-cartoon-panda-21.png",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAGACb4sS5zEzD-GQK-p7xsG50GSfK3LBxOOmaK7-18_axSR22",
            "https://i.pinimg.com/736x/09/52/07/095207186e097139329a7a47ea12ee88--vintage-cartoons-classic-cartoons.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView.adapter = CustomView(this, images)


    }
}
