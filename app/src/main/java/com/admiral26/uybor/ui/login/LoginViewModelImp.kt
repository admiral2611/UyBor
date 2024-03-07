package com.admiral26.uybor.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.uybor.core.cache.LocalStorage
import com.admiral26.uybor.core.model.login.LoginRequest
import com.admiral26.uybor.core.model.login.LoginResponse
import com.admiral26.uybor.core.repo.LoginRepository
import com.admiral26.uybor.util.ResultWrapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModelImp @Inject constructor(
    private val repository: LoginRepository,
    private val cache: LocalStorage
):LoginViewModel,ViewModel() {
    private val _loginLd=MutableLiveData<LoginResponse?>()
    override val loginLd: LiveData<LoginResponse?> = _loginLd

    override fun login(login: LoginRequest) {

        viewModelScope.launch(Dispatchers.IO) {
            when (val result = repository.signLogin(login)) {
                is ResultWrapper.ErrorResponse -> {

                }

                is ResultWrapper.NetworkError -> {

                }

                is ResultWrapper.Success -> {
                    _loginLd.postValue(result.response)
                }
            }
        }
    }

    override fun saveAccessToken(access: String) {
        cache.access = access
    }
}