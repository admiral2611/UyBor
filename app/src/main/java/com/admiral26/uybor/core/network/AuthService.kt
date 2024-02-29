package com.admiral26.uybor.core.network

import android.view.PixelCopy.Request
import com.admiral26.uybor.core.model.NumberRequest
import com.admiral26.uybor.core.model.NumberResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthService {

    @POST("/use/signup")
    fun signUp(@Body body:NumberRequest):Response<NumberResponse?>
}