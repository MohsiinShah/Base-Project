package com.openweathermap.forecast.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.RecyclerView
import com.openweathermap.forecast.databinding.ItemLayoutBinding
import com.openweathermap.forecast.models.Dummy

class MainAdapter(private val context: Context, private var dataList: MutableList<Dummy>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemLayoutBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.bind(data)
    }

    inner class ViewHolder(private var itemRowBinding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(itemRowBinding.root) {

        var binding: ItemLayoutBinding = itemRowBinding

        fun bind(obj: Dummy) {
            itemRowBinding.setVariable(BR.item, obj)
            itemRowBinding.executePendingBindings()
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}