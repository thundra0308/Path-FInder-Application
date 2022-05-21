package com.example.pathfinder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pathfinder.databinding.RecyclerviewItemBinding

class Adapter(val items: List<String>): RecyclerView.Adapter<Adapter.MainViewHolder>() {

    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding):RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(algo: String) {
            itemBinding.tvItem.text = algo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val algo = items[position]
        holder.bindItem(algo)
    }

    override fun getItemCount(): Int {
        return items.size
    }

}