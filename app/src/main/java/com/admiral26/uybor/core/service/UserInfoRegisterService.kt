package com.admiral26.uybor.core.service

import com.admiral26.uybor.core.model.userInfo.UserInfoRequest
import com.admiral26.uybor.core.model.userInfo.UserInfoResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.PUT

interface UserInfoRegisterService {

@PUT("/use/change_user/")
suspend fun addInfoUser(
    @Body user:UserInfoRequest
):Response<UserInfoResponse?>
}