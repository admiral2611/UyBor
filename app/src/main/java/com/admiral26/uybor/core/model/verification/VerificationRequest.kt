package com.admiral26.uybor.core.model.verification


import com.google.gson.annotations.SerializedName

data class VerificationRequest(
    @SerializedName("code")
    val code: String // 4587
)