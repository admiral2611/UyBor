package com.admiral26.uybor.core.repo.imp

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.movieappmvvmauth.util.parseResponse
import com.admiral26.uybor.core.model.code.CodeResponse
import com.admiral26.uybor.core.model.verification.VerificationRequest
import com.admiral26.uybor.core.model.verification.VerificationResponse
import com.admiral26.uybor.core.repo.VerificationRepository
import com.admiral26.uybor.core.service.VerificationService
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class VerificationRepositoryImp @Inject constructor(
    private val service: VerificationService
):VerificationRepository {
    override suspend fun getCode(): ResultWrapper<CodeResponse?, Any> {
        return parseResponse(Dispatchers.IO){
            service.getCode()
        }
    }
    override suspend fun verificationNum(code: VerificationRequest): ResultWrapper<VerificationResponse?, Any> {
 return parseResponse(Dispatchers.IO){
     service.verificationNumber(code)
 }
    }
}