package com.admiral26.uybor.core.repo.imp

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.movieappmvvmauth.util.parseResponse
import com.admiral26.uybor.core.model.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.userInfo.UserInfoResponse
import com.admiral26.uybor.core.repo.UserInfoRepository
import com.admiral26.uybor.core.service.UserInfoRegisterService
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class UserInfoRepositoryImp @Inject constructor(
    private val service: UserInfoRegisterService
):UserInfoRepository {
    override suspend fun createUserInfo(user: UserInfoRequest): ResultWrapper<UserInfoResponse?, Any> {
        return parseResponse(Dispatchers.IO){
            service.addInfoUser(user)
        }
    }
}