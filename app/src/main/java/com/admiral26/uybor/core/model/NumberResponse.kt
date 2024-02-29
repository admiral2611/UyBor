package com.admiral26.uybor.core.model


import com.google.gson.annotations.SerializedName

data class NumberResponse(
    @SerializedName("access")
    val access: String, // eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNzA5Mjk1NTU1LCJpYXQiOjE3MDkyMDkxNTUsImp0aSI6IjEwY2NhODZjNDlmYTRkZDM4MmJlMzQzMzA0ZmNkMzZjIiwidXNlcl9pZCI6IjgzOTYyMDI0LTVhMGYtNDJhNS1iYmE0LWQwZWNiNGFmZDdkZCJ9.xlm4tyRu7bBC9cmupbrO8lJU5tG6crv_0dT6YqAoq68
    @SerializedName("auth_status")
    val authStatus: String, // new
    @SerializedName("auth_type")
    val authType: String, // via_phone
    @SerializedName("id")
    val id: String, // 83962024-5a0f-42a5-bba4-d0ecb4afd7dd
    @SerializedName("refresh_token")
    val refreshToken: String // eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbl90eXBlIjoicmVmcmVzaCIsImV4cCI6MTcxMDUwNTE1NSwiaWF0IjoxNzA5MjA5MTU1LCJqdGkiOiJmNWE5MmRhZTM0ODk0YTNiOGY2MWIxZTMyZGZiOGMxYyIsInVzZXJfaWQiOiI4Mzk2MjAyNC01YTBmLTQyYTUtYmJhNC1kMGVjYjRhZmQ3ZGQifQ._v8_gYLuEUI6QRlCcff8wrywjI1IOL9QQ3b5-6UfaN0
)