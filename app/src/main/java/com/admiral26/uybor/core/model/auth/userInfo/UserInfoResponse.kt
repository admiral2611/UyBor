package com.admiral26.uybor.core.model.auth.userInfo


import com.google.gson.annotations.SerializedName

data class UserInfoResponse(
    @SerializedName("auth_status")
    val authStatus: String, // done
    @SerializedName("message")
    val message: String, // User muvofaqiyatli yangilandi
    @SerializedName("success")
    val success: Boolean // true
)