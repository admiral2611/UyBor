package com.admiral26.uybor.core.repo

import com.admiral26.uybor.util.ResultWrapper
import com.admiral26.uybor.core.model.auth.signUp.NumberRequest
import com.admiral26.uybor.core.model.auth.signUp.NumberResponse

interface SignUpRepository {
    suspend fun userNumber(number: NumberRequest): ResultWrapper<NumberResponse?, Any>
}