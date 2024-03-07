package com.admiral26.uybor.core.model.login


import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("password")
    val password: String, // AA12345678
    @SerializedName("userinput")
    val userinput: String // admiral_26
)