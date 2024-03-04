package com.admiral26.uybor.core.service

import com.admiral26.uybor.core.model.home.HomeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface HomeService {
    @GET("/home_list/")
    suspend fun getAllHome(@Header("Authorization") sessionId: String): Response<HomeResponse?>
}