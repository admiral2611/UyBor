package com.admiral26.uybor.ui.auth.userInfo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.uybor.util.ResultWrapper
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoResponse
import com.admiral26.uybor.core.repo.UserInfoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserInfoViewModelImp @Inject constructor(
    private val repository: UserInfoRepository
) : UserInfoViewModel, ViewModel() {
    private val _userInfo = MutableLiveData<UserInfoResponse?>()
    override val userInfo: LiveData<UserInfoResponse?> = _userInfo

    override fun userInfo(data: UserInfoRequest) {
        Log.d("TAGuser", "userInfo1:")
        viewModelScope.launch(Dispatchers.IO) {
            Log.d("TAGuser", "userInfo2:")
            when (val result = repository.createUserInfo(data)) {
                is ResultWrapper.ErrorResponse -> {
                    Log.d("TAGuser", "userInfo: ${result.code}")
                }

                is ResultWrapper.NetworkError -> {
                    Log.d("TAGuser", "userInfo: ${result.code}")
                }

                is ResultWrapper.Success -> {
                    Log.d("TAGuser", "userInfo: ${result.response}")
                    _userInfo.postValue(result.response)
                }
            }
        }
    }

}