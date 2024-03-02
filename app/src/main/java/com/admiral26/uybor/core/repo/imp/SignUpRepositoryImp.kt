package com.admiral26.uybor.core.repo.imp

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.movieappmvvmauth.util.parseResponse
import com.admiral26.uybor.core.model.signUp.NumberRequest
import com.admiral26.uybor.core.model.signUp.NumberResponse
import com.admiral26.uybor.core.repo.SignUpRepository
import com.admiral26.uybor.core.service.SignUpService
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher
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