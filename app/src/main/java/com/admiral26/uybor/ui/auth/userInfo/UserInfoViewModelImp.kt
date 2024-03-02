package com.admiral26.uybor.ui.auth.userInfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.uybor.core.model.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.userInfo.UserInfoResponse
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
        viewModelScope.launch(Dispatchers.IO) {
            when (val result = repository.createUserInfo(data)) {
                is ResultWrapper.ErrorResponse -> {

                }

                is ResultWrapper.NetworkError -> {

                }

                is ResultWrapper.Success -> {
                    _userInfo.postValue(result.response)
                }
            }
        }
    }

}