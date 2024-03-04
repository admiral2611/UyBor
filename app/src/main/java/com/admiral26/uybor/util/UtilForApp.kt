package com.admiral26.uybor.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView

const val Base_Url="https://back.diyorbek-dev.uz/"


fun ImageView.imageHome(url:String) {
    Glide.with(this.context)
        .load(url)
        .into(this)
}