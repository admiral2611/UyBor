package com.admiral26.uybor.core.service

import com.admiral26.uybor.core.model.login.LoginRequest
import com.admiral26.uybor.core.model.login.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("/use/login/")
    suspend fun login(@Body login: LoginRequest): Response<LoginResponse?>
}