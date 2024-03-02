package com.admiral26.uybor.core.repo

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.uybor.core.model.code.CodeResponse
import com.admiral26.uybor.core.model.signUp.NumberRequest
import com.admiral26.uybor.core.model.verification.VerificationRequest
import com.admiral26.uybor.core.model.verification.VerificationResponse

interface VerificationRepository {
    suspend fun getCode(): ResultWrapper<CodeResponse?, Any>
    suspend fun verificationNum(code: VerificationRequest): ResultWrapper<VerificationResponse?, Any>
}