package com.admiral26.uybor.core.repo.imp

import com.admiral26.uybor.util.ResultWrapper
import com.admiral26.uybor.util.parseResponse
import com.admiral26.uybor.core.model.auth.signUp.NumberRequest
import com.admiral26.uybor.core.model.auth.signUp.NumberResponse
import com.admiral26.uybor.core.repo.SignUpRepository
import com.admiral26.uybor.core.service.SignUpService
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class SignUpRepositoryImp @Inject constructor(
    private val service: SignUpService
) : SignUpRepository {
    override suspend fun userNumber(number: NumberRequest): ResultWrapper<NumberResponse?, Any> {
        return parseResponse(Dispatchers.IO) {
            service.createSignUp(number)
        }
    }

}