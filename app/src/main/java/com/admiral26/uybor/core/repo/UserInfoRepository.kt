package com.admiral26.uybor.core.repo

import com.admiral26.uybor.util.ResultWrapper
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoResponse

interface UserInfoRepository {
    suspend fun createUserInfo(user: UserInfoRequest): ResultWrapper<UserInfoResponse?, Any>
}