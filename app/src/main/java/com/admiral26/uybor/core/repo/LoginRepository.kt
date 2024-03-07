package com.admiral26.uybor.core.repo

import com.admiral26.uybor.core.model.login.LoginRequest
import com.admiral26.uybor.core.model.login.LoginResponse
import com.admiral26.uybor.util.ResultWrapper

interface LoginRepository {
    suspend fun signLogin(login: LoginRequest): ResultWrapper<LoginResponse?, Any>
}