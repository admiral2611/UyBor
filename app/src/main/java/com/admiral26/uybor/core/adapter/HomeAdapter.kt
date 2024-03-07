package com.admiral26.uybor.core.adapter

import android.annotation.SuppressLint
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.RelativeSizeSpan
import android.text.style.SubscriptSpan
import android.text.style.SuperscriptSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.admiral26.uybor.core.model.home.Picture
import com.admiral26.uybor.core.model.home.ResultArticle
import com.admiral26.uybor.databinding.ItemHomeBinding
import com.admiral26.uybor.util.imageHome

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    private val onItem: ((id: Int) -> UInt)? = null
    private val data = ArrayList<ResultArticle>()

    fun setData(data: List<ResultArticle>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class HomeViewHolder(private val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindData(data: ResultArticle) {
            // http://back.diyorbek-dev.uz/media/home/wallpaperflare.com_wallpaper_4_eiPHRHF.jpg

            binding.textView.text = data.price + "y.e"
            binding.textView2.text = data.area
            binding.textView3.text = data.location


            itemView.setOnClickListener {
                onItem?.invoke(data.id)
            }
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