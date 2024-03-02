package com.admiral26.uybor.core.service

import com.admiral26.uybor.core.model.signUp.NumberRequest
import com.admiral26.uybor.core.model.signUp.NumberResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface SignUpService {

    @POST("/use/signup/")
    suspend fun createSignUp(@Body number: NumberRequest): Response<NumberResponse?>

}