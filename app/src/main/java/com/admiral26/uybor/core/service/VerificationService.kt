package com.admiral26.uybor.core.service

import com.admiral26.uybor.core.model.code.CodeResponse
import com.admiral26.uybor.core.model.verification.VerificationRequest
import com.admiral26.uybor.core.model.verification.VerificationResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface VerificationService {

    @GET("/use/codes/")
    suspend fun getCode(): Response<CodeResponse?>

    @POST("/use/verify/")
    suspend fun verificationNumber(
        @Body code: VerificationRequest
    ): Response<VerificationResponse?>
}