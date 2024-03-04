package com.admiral26.uybor.ui.auth.userInfo

import androidx.lifecycle.LiveData
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoResponse

interface UserInfoViewModel {

    val userInfo: LiveData<UserInfoResponse?>

    fun userInfo(data: UserInfoRequest)
}