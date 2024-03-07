package com.admiral26.uybor.core.repo.imp

import com.admiral26.uybor.core.model.login.LoginRequest
import com.admiral26.uybor.core.model.login.LoginResponse
import com.admiral26.uybor.core.repo.LoginRepository
import com.admiral26.uybor.core.service.LoginService
import com.admiral26.uybor.util.ResultWrapper
import com.admiral26.uybor.util.parseResponse
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class LoginRepositoryImp @Inject constructor(
    private val service:LoginService
):LoginRepository {
    override suspend fun signLogin(login: LoginRequest): ResultWrapper<LoginResponse?, Any> {
        return parseResponse(Dispatchers.IO){
            service.login(login)
        }
    }
}