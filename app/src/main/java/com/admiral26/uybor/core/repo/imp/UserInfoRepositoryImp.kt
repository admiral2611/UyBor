package com.admiral26.uybor.core.repo.imp

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.movieappmvvmauth.util.parseResponse
import com.admiral26.uybor.core.cache.LocalStorage
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.auth.userInfo.UserInfoResponse
import com.admiral26.uybor.core.repo.UserInfoRepository
import com.admiral26.uybor.core.service.UserInfoRegisterService
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class UserInfoRepositoryImp @Inject constructor(
    private val service: UserInfoRegisterService,
    private val sessionId:LocalStorage
):UserInfoRepository {
    override suspend fun createUserInfo(user: UserInfoRequest): ResultWrapper<UserInfoResponse?, Any> {
        return parseResponse(Dispatchers.IO){
            service.addInfoUser(user,"Bearer " + sessionId.access)
        }
    }
}