package com.admiral26.uybor.core.service

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface DetailService {
    @GET("/home_detail/")
   suspend fun homeDetail(
        @Path("id") id: Int,
        @Header("Authorization") sessionId: String
    )
}