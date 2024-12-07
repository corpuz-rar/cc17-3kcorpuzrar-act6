package com.example.act6_30days

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val content: List<String>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
        class ViewHolder (itemView: View) :
            RecyclerView.ViewHolder(itemView) {
            val Day_Desc_A: TextView = itemView.findViewById(R.id.Day_Desc)
            val Day_Image_A: ImageView = itemView.findViewById(R.id.Day_Image)
            }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.contents, parent, false)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int {
            return content.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = content[position]
            holder.Day_Desc_A.text = item

            val imageResource = when (position) {
                0 -> R.drawable.day_1
                1 -> R.drawable.day_2
                2 -> R.drawable.day_3
                3 -> R.drawable.day_4
                4 -> R.drawable.day_5
                5 -> R.drawable.day_6
                6 -> R.drawable.day_7
                7 -> R.drawable.day_8
                8 -> R.drawable.day_9
                9 -> R.drawable.day_10
                10 -> R.drawable.day_11
                11 -> R.drawable.day_12
                12 -> R.drawable.day_13
                13 -> R.drawable.day_14
                14 -> R.drawable.day_15
                15 -> R.drawable.day_16
                16 -> R.drawable.day_17
                17 -> R.drawable.day_18
                18 -> R.drawable.day_19
                19 -> R.drawable.day_20
                20 -> R.drawable.day_21
                21 -> R.drawable.day_22
                22 -> R.drawable.day_23
                23 -> R.drawable.day_24
                24 -> R.drawable.day_25
                25 -> R.drawable.day_26
                26 -> R.drawable.day_27
                27 -> R.drawable.day_28
                28 -> R.drawable.day_29
                else -> R.drawable.day_30
            }
        holder.Day_Image_A.setImageResource(imageResource)
    }
}