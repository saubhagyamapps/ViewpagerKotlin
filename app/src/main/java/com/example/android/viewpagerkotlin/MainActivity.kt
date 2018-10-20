package com.example.android.viewpagerkotlin

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adepter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialization()
    }

    private fun initialization() {
        setSupportActionBar(toolbar)
        setupViewPager(viewpager!!)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tabs.setupWithViewPager(viewpager)
    }

    public fun setupViewPager(viewpager: ViewPager) {
        adepter = ViewPagerAdapter(supportFragmentManager)
        adepter.addFragment(OneFragment(), "one")
        adepter.addFragment(OneFragment(), "one")
        adepter.addFragment(OneFragment(), "one")
        viewpager?.adapter=adepter
    }
}
