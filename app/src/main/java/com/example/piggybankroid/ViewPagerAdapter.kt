package com.example.piggybankroid

import android.view.Window
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{
    override fun getItem(position: Int): Fragment = when(position){
        0 -> HomeFragment()
        1 -> ListFragment()
        2 -> GoodsFragment()
        3 -> ProfileFragment()
        else -> throw IllegalStateException("Unexpected position $position")
    }
    override fun getCount(): Int = 4
}