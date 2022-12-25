package com.restaurantapp.app.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.restaurantapp.app.R
import com.restaurantapp.app.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    private var binding: ActivityHomeBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        setupViewPager()

    }

    private fun setupViewPager() {

        val adapter = HomeFragmentPagerAdapter(supportFragmentManager)
        val container = listOf("Shop") //"Imported chocolates", "Classic Watches", "Footwear", "Luxury wateches")
        for (item in container) {
            val itemFrame: ContainerFragment = ContainerFragment.newInstance(item)
            adapter.addFragment(itemFrame, item)
        }


        binding?.viewpager!!.adapter = adapter
        //binding!!.tabs!!.setupWithViewPager(binding!!.viewpager)
    }

}
