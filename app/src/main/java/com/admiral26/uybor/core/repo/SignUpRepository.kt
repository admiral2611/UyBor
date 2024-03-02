package com.admiral26.uybor.core.repo

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.uybor.core.model.signUp.NumberRequest
import com.admiral26.uybor.core.model.signUp.NumberResponse

interface SignUpRepository {
    suspend fun userNumber(number: NumberRequest): ResultWrapper<NumberResponse?, Any>
}