package com.admiral26.uybor.core.repo

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.uybor.core.model.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.userInfo.UserInfoResponse

interface UserInfoRepository {
    suspend fun createUserInfo(user: UserInfoRequest): ResultWrapper<UserInfoResponse?, Any>
}