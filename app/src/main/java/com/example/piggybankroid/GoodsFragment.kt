package com.example.piggybankroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.fragment_goods.*

class GoodsFragment : Fragment() {
    private lateinit var goodsViewPagerAdapter: GoodsViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_goods, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        goodsViewPagerAdapter = GoodsViewPagerAdapter(childFragmentManager)

        vp_frag_goods.adapter = goodsViewPagerAdapter
        vp_frag_goods.setPadding(120,0,120,0)

        tl_frag_goods.setupWithViewPager(vp_frag_goods)

//        tl_frag_goods.apply{
//            getTabAt(0)?.setIcon(R.drawable.ellipse_2_3x)
//            getTabAt(1)?.setIcon(R.drawable.ellipse_2_3x)
//            getTabAt(2)?.setIcon(R.drawable.ellipse_2_3x)
//        }

        super.onViewCreated(view, savedInstanceState)
    }
}