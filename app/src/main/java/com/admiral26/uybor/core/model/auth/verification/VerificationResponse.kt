package com.admiral26.uybor.core.model.auth.verification


import com.google.gson.annotations.SerializedName

data class VerificationResponse(
    @SerializedName("access")
    val access: String, // eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNzA5NDU3NzA0LCJpYXQiOjE3MDkzNzEzMDQsImp0aSI6ImY4YWExMTkzMGM5MjQ4OGQ4MzFmMjkwMjlhMTlhNzg1IiwidXNlcl9pZCI6ImU4YTQwNjNlLTIzOGYtNGU1OS05Y2M5LWEyZTllMDg1YmY5OCJ9.obicfn5M2wOnV_L1AeBBWWI5fwpbB7k0ihHEEHvyNds
    @SerializedName("auth_status")
    val authStatus: String, // code_verified
    @SerializedName("refresh")
    val refresh: String, // eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoicmVmcmVzaCIsImV4cCI6MTcxMDY2NzMwNCwiaWF0IjoxNzA5MzcxMzA0LCJqdGkiOiJhZWE3NWU0NTM5MmU0MWU1YWYxNjI4ZjA3MDI3NmQwMCIsInVzZXJfaWQiOiJlOGE0MDYzZS0yMzhmLTRlNTktOWNjOS1hMmU5ZTA4NWJmOTgifQ.9EkCP4iIB8A6cNm9CjKiD06FwnBk3Yqcof70pmxc5TE
    @SerializedName("success")
    val success: Boolean // true
)
