package com.example.piggybankroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.banklist_item.*
import kotlinx.android.synthetic.main.banklist_item.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {
    private lateinit var profileAdapter: ProfileAdapter

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_home, container, false)

        profileAdapter= ProfileAdapter(context as MainActivity)

        v.banklist_rcv!!.adapter=profileAdapter
        v.banklist_rcv!!.layoutManager= LinearLayoutManager(context)



        profileAdapter.data= mutableListOf(
            SampleDATA("우리은행", "20,000원"),
            SampleDATA("카카오뱅크", "20,000원"),
            SampleDATA("국민은행", "-20,000원"),
            SampleDATA("신한은행", "20,000원"),
            SampleDATA("농협은행", "-20,000원"),
            SampleDATA("기업은행", "-20,000원"),
            SampleDATA("어떤은행", "20,000원"),
        )
        profileAdapter.notifyDataSetChanged()

        return v
    }


}