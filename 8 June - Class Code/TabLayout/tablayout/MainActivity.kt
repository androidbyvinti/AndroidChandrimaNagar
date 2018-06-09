package com.bmpl.tablayout

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", View.OnClickListener {
                    }).show()
        }

        tabLayout.setupWithViewPager(viewPager) // binding tablayout with view pager
        setUpTabs(viewPager) // custom method

    }
    // data set tabs --> View Pager
    fun setUpTabs(viewPager : ViewPager){
                                    // getSupportFragmentManager() --> Default FragmentManager load
        var fragmentData = FragmentData(supportFragmentManager)

        var blankFragment = BlankFragment()
        fragmentData.add(BlankFragment(), "Blank")   // BlankFragment is loaded here
        fragmentData.add(ContactsFragment(), "Contacts")
        viewPager.adapter = fragmentData
    }

    // inner class
    class FragmentData(fm : FragmentManager) : FragmentPagerAdapter(fm){

        var fragmentList = ArrayList<Fragment>()
        var titleList = ArrayList<String>()

        fun add(fragment : Fragment, title : String){
            fragmentList.add(fragment)
            titleList.add(title)

        }

        override fun getPageTitle(position: Int): CharSequence {
            return titleList[position]
        }

        override fun getItem(position: Int): Fragment {
           return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
