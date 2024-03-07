package com.admiral26.uybor.core.model.login


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("access")
    val access: String, // eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNzA5ODQzODE2LCJpYXQiOjE3MDk3NTc0MTYsImp0aSI6IjkyYjg1ZTY0OGYwNTQzMjRhM2ZkYjBjOGQwYjUzZDNmIiwidXNlcl9pZCI6ImEzMWNlY2U1LTQ0YmUtNGI3Yi1hMzdhLWY0ZjFkNDdhYzZjNCJ9.Df0qfdKXoteTJzn-LDh_DkCTkUBteth9ysfs9I4SRo4
    @SerializedName("auth_status")
    val authStatus: String, // done
    @SerializedName("full_name")
    val fullName: String, // Azizbek Muxammadjonov
    @SerializedName("refresh_token")
    val refreshToken: String // eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoicmVmcmVzaCIsImV4cCI6MTcxMTA1MzQxNiwiaWF0IjoxNzA5NzU3NDE2LCJqdGkiOiIyOGVlZWI1MTE3Mzk0YzkzYWNjMmQwN2YzOWZjMzMwMSIsInVzZXJfaWQiOiJhMzFjZWNlNS00NGJlLTRiN2ItYTM3YS1mNGYxZDQ3YWM2YzQifQ.aqavbjoMbuvPLDkwuQeNdZtceQ2adXJwcafv-8Lv9Vo
)