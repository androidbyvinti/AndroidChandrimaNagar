package com.bmpl.listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var androidVersions = arrayOf("Cupcake", "Donut", "Eclair",
                                    "Froyo", "GingerBread", "HoneyComb",
                                    "Ice-cream Sandwich", "JellyBean", "Kitkat",
                                    "Lollipop", "Marshmallow", "Nougat", "Oreo", "P")

    var profileImage = arrayOf(R.drawable.profile_img, R.drawable.profile_img,
                        R.drawable.profile_img,R.drawable.profile_img,
                        R.drawable.profile_img, R.drawable.profile_img, R.drawable.profile_img,
                        R.drawable.profile_img, R.drawable.profile_img,R.drawable.profile_img,
                        R.drawable.profile_img, R.drawable.profile_img, R.drawable.profile_img,
                        R.drawable.profile_img)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //listView.text

        //var arrayAdapter = ArrayAdapter(this, R.layout.custom_row, androidVersions)



        listView.adapter = CustomListView(this, androidVersions, profileImage)

        // container --> listview and spinner
                                        // listview --> view
        listView.setOnItemClickListener { adapterView, view, index, id ->
            Toast.makeText(this, "You clicked on $id", Toast.LENGTH_LONG).show()
        }

    }
}
