package com.admiral26.uybor.core.model.home


import com.google.gson.annotations.SerializedName

data class HomeResponse(
    @SerializedName("count")
    val count: Int, // 2
    @SerializedName("next")
    val next: Any, // null
    @SerializedName("previous")
    val previous: Any, // null
    @SerializedName("results")
    val results: List<ResultArticle>
)