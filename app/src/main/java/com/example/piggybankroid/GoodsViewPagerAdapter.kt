package com.example.piggybankroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class GoodsViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{
    override fun getItem(position: Int): Fragment = when(position){
        0 -> GoodsContentFragment1()
        1 -> GoodsContentFragment2()
        2 -> GoodsContentFragment3()
        else -> throw IllegalStateException("Unexpected position $position")
    }
    override fun getCount(): Int = 3
}