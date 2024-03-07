package com.admiral26.uybor.core.repo

import com.admiral26.uybor.core.model.auth.code.CodeResponse
import com.admiral26.uybor.util.ResultWrapper
import com.admiral26.uybor.core.model.auth.verification.VerificationRequest
import com.admiral26.uybor.core.model.auth.verification.VerificationResponse

interface VerificationRepository {
    suspend fun getCode(): ResultWrapper<CodeResponse?, Any>
    suspend fun verificationNum(code: VerificationRequest): ResultWrapper<VerificationResponse?, Any>
}