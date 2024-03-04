package com.admiral26.uybor.core.model.auth.code


import com.google.gson.annotations.SerializedName

data class CodeResponse(
    @SerializedName("code")
    val code: String, // 7953
    @SerializedName("created_time")
    val createdTime: String, // 2024-03-02T14:07:37.846625+05:00
    @SerializedName("expiration_time")
    val expirationTime: String, // 2024-03-02T14:09:37.846349+05:00
    @SerializedName("id")
    val id: String, // 8133677e-80c4-4efc-86ca-773ec324623b
    @SerializedName("is_confirmed")
    val isConfirmed: Boolean, // false
    @SerializedName("updated_time")
    val updatedTime: String, // 2024-03-02T14:07:37.846641+05:00
    @SerializedName("user")
    val user: String, // e8a4063e-238f-4e59-9cc9-a2e9e085bf98
    @SerializedName("verify_type")
    val verifyType: String // via_phone
)