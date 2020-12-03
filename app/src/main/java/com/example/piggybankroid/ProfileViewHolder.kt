package com.example.piggybankroid

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title: TextView = itemView.findViewById(R.id.title)
    private val subTitle: TextView = itemView.findViewById(R.id.subTitle)

    @SuppressLint("ResourceAsColor")
    fun onBind(data: SampleDATA) {
        title.text = data.title
        subTitle.text = data.subTitle
    }

}