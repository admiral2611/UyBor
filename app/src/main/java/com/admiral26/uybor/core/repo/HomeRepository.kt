package com.admiral26.uybor.core.repo

import com.admiral26.movieappmvvmauth.util.ResultWrapper
import com.admiral26.uybor.core.model.home.HomeResponse

interface HomeRepository {

    suspend fun getAllHome(): ResultWrapper<HomeResponse?, Any>
}