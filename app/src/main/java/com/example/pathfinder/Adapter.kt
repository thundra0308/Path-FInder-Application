package com.example.pathfinder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.pathfinder.databinding.RecycleviewItemBinding

class Adapter(val item1: List<String>, val item2: List<String>): RecyclerView.Adapter<Adapter.MainViewHolder>() {

    class MainViewHolder(itemBinding: RecycleviewItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        val tvItem = itemBinding.tvItem
        val btn1 = itemBinding.btn1
        val btn2 = itemBinding.btn2
        val text1 = itemBinding.text1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecycleviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        val context = holder.itemView.context
        val item3 = item1[position]
        val item4 = item2[position]

        holder.btn1.text = item3
        holder.btn2.text = item4

        if(position%2==0) {
            holder.tvItem.setCardBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.cardview1))
            holder.text1.text = "Weighted-Shortest"
        } else {
            holder.tvItem.setCardBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.cardview2))
            holder.text1.text = "Unweighted"
        }

    }

    override fun getItemCount(): Int {
        return item1.size
    }

}