package com.example.piggybankroid

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.core.content.res.ResourcesCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.color.MaterialColors.getColor
import kotlinx.android.synthetic.main.banklist_item.view.*

class ProfileAdapter(var context : Context): RecyclerView.Adapter<ProfileViewHolder>() {
    var data= mutableListOf<SampleDATA>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.banklist_item,parent,false)
        return ProfileViewHolder(view)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        if(position==2||position==4||position==5){
            holder.itemView.subTitle.setTextColor(ContextCompat.getColor(context, R.color.pinkEC))
        }
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int =data.size
}