package com.admiral26.uybor.ui.login

import androidx.lifecycle.LiveData
import com.admiral26.uybor.core.model.login.LoginRequest
import com.admiral26.uybor.core.model.login.LoginResponse

interface LoginViewModel {
    val loginLd: LiveData<LoginResponse?>
    fun login(login: LoginRequest)
    fun saveAccessToken(access:String)
}