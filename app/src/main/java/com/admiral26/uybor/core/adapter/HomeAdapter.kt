package com.admiral26.uybor.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.admiral26.uybor.core.model.home.HomeResponse
import com.admiral26.uybor.core.model.home.ResultArticle
import com.admiral26.uybor.databinding.ItemHomeBinding
import com.admiral26.uybor.util.imageHome

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private val data = ArrayList<ResultArticle>()

    fun setData(data: List<ResultArticle>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class HomeViewHolder(private val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: ResultArticle) {
            binding.imageView.imageHome(data.pictures.toString())
            binding.textView.text = data.price+"y.e"
            binding.textView2.text = data.area
            binding.textView3.text = data.location
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            HomeAdapter.HomeViewHolder {
        return HomeViewHolder(
            ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: HomeAdapter.HomeViewHolder, position: Int) {
        holder.bindData(data[position])
    }


    override fun getItemCount() = data.size
}