package com.admiral26.uybor.core.model


import com.google.gson.annotations.SerializedName

data class NumberRequest(
    @SerializedName("email_phone_number")
    val emailPhoneNumber: String // +998900596420
)