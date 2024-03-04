package com.admiral26.uybor.core.repo.imp

import android.util.Log
import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.movieappmvvmauth.util.parseResponse
import com.admiral26.uybor.core.cache.LocalStorage
import com.admiral26.uybor.core.model.auth.code.CodeResponse
import com.admiral26.uybor.core.model.auth.verification.VerificationRequest
import com.admiral26.uybor.core.model.auth.verification.VerificationResponse
import com.admiral26.uybor.core.repo.VerificationRepository
import com.admiral26.uybor.core.service.VerificationService
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class VerificationRepositoryImp @Inject constructor(
    private val service: VerificationService,
    private val sessionId: LocalStorage
) : VerificationRepository {
    override suspend fun getCode(): ResultWrapper<CodeResponse?, Any> {
        Log.d("TAGaaa", "getCode: ")
        return parseResponse(Dispatchers.IO) {
            service.getCode("Bearer " + sessionId.access)
        }
    }

    override suspend fun verificationNum(code: VerificationRequest): ResultWrapper<VerificationResponse?, Any> {
        return parseResponse(Dispatchers.IO) {
            service.verificationNumber(code, "Bearer " + sessionId.access)
        }
    }
}