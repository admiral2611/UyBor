package com.admiral26.uybor.ui.auth.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.uybor.util.ResultWrapper
import com.admiral26.uybor.core.cache.LocalStorage
import com.admiral26.uybor.core.model.auth.signUp.NumberRequest
import com.admiral26.uybor.core.model.auth.signUp.NumberResponse
import com.admiral26.uybor.core.repo.SignUpRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModelImp @Inject constructor(
    private val repository: SignUpRepository,
    private val cache: LocalStorage
) : SignUpViewModel, ViewModel() {
    private val _numberLd = MutableLiveData<NumberResponse?>()
    private val error=MutableLiveData<String>()
    override val numberLd: LiveData<NumberResponse?> = _numberLd

    override fun number(number: NumberRequest) {
        viewModelScope.launch(Dispatchers.IO) {
            when (val result = repository.userNumber(number)) {
                is ResultWrapper.ErrorResponse -> {

                }

                is ResultWrapper.NetworkError -> {

                }

                is ResultWrapper.Success -> {
                    result.response?.access?.let { saveAccess(it) }
                }
            }
        }
    }

    override fun saveAccess(access: String) {
        cache.access=access
    }
}