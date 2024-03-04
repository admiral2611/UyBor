package com.admiral26.uybor.ui.auth.codeVerification

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.uybor.core.model.auth.code.CodeResponse
import com.admiral26.uybor.core.model.auth.verification.VerificationRequest
import com.admiral26.uybor.core.model.auth.verification.VerificationResponse
import com.admiral26.uybor.core.repo.VerificationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CodeViewModelImp @Inject constructor(
    private val repository: VerificationRepository
) : CodeViewModel, ViewModel() {
    private val _getCodeLd = MutableLiveData<CodeResponse?>()
    private val _verificationNum = MutableLiveData<VerificationResponse?>()

    override val getCodeLd: LiveData<CodeResponse?> = _getCodeLd
    override val verificationNum: LiveData<VerificationResponse?> = _verificationNum

    override fun getCode() {
        Log.d("TAGaaa", "getCode: ")
        viewModelScope.launch(Dispatchers.IO) {
            when (val result = repository.getCode()) {

                is ResultWrapper.ErrorResponse -> {

                }

                is ResultWrapper.NetworkError -> {

                }

                is ResultWrapper.Success -> {
                    Log.d("TAG", "getCode: ${result.response}")
                    _getCodeLd.postValue(result.response)
                }
            }
        }
    }

    override fun verificationNumb(code: VerificationRequest) {
        viewModelScope.launch(Dispatchers.IO) {
            when (val result = repository.verificationNum(code)) {

                is ResultWrapper.ErrorResponse -> {

                }

                is ResultWrapper.NetworkError -> {

                }

                is ResultWrapper.Success -> {
                    _verificationNum.postValue(result.response)
                }
            }
        }
    }
}