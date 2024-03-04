package com.admiral26.uybor.core.repo.imp

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.movieappmvvmauth.util.parseResponse
import com.admiral26.uybor.core.cache.LocalStorage
import com.admiral26.uybor.core.model.home.HomeResponse
import com.admiral26.uybor.core.repo.HomeRepository
import com.admiral26.uybor.core.service.HomeService
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class HomeRepositoryImp @Inject constructor(
    private val service:HomeService,
    private val sessionId:LocalStorage
):HomeRepository {
    override suspend fun getAllHome(): ResultWrapper<HomeResponse?, Any> {
        return parseResponse(Dispatchers.IO){
            service.getAllHome("Bearer " + sessionId.access)
        }
    }
}