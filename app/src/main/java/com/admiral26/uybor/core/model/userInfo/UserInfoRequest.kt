package com.admiral26.uybor.core.model.userInfo


import com.google.gson.annotations.SerializedName

data class UserInfoRequest(
    @SerializedName("confirm_password")
    val confirmPassword: String, // AA12345678
    @SerializedName("first_name")
    val firstName: String, // Azizbek
    @SerializedName("last_name")
    val lastName: String, // Muxammadjonov
    @SerializedName("password")
    val password: String, // AA12345678
    @SerializedName("username")
    val username: String // admiral_26
)