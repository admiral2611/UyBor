package com.admiral26.uybor.core.model.home


import com.google.gson.annotations.SerializedName

data class Picture(
    @SerializedName("created")
    val created: String, // 2024-03-04T19:51:55.088677+05:00
    @SerializedName("pic")
    val pic: String, // http://back.diyorbek-dev.uz/media/home/wallpaperflare.com_wallpaper_4_eiPHRHF.jpg
    @SerializedName("updated")
    val updated: String // 2024-03-04T19:51:55.088697+05:00
)