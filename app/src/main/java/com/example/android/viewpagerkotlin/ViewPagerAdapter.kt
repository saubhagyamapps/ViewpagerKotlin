package com.example.android.viewpagerkotlin

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    val fragments = ArrayList<Fragment>()
    val titles = ArrayList<String>()
    override fun getItem(position: Int): Fragment = fragments.get(position)
    override fun getPageTitle(position: Int): CharSequence? = titles.get(position)
    override fun getCount(): Int = fragments.size
    public fun addFragment(fragment: Fragment, title: String) {
        fragments.add(fragment)
        titles.add(title)
    }
}