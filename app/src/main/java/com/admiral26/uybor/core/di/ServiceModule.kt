package com.admiral26.uybor.core.di

import com.admiral26.uybor.core.cache.LocalStorage
import com.admiral26.uybor.core.service.HomeService
import com.admiral26.uybor.core.service.LoginService
import com.admiral26.uybor.core.service.SignUpService
import com.admiral26.uybor.core.service.UserInfoRegisterService
import com.admiral26.uybor.core.service.VerificationService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @[Provides Singleton]
    fun provideSignUp(retrofit: Retrofit): SignUpService {
        return retrofit.create(SignUpService::class.java)
    }

    @[Provides Singleton]
    fun provideVerification(retrofit: Retrofit): VerificationService {
        return retrofit.create(VerificationService::class.java)
    }

    @[Provides Singleton]
    fun provideUserInfo(retrofit: Retrofit): UserInfoRegisterService {
        return retrofit.create(UserInfoRegisterService::class.java)
    }

    @[Provides Singleton]
    fun provideHome(retrofit: Retrofit): HomeService {
        return retrofit.create(HomeService::class.java)
    }

    @[Provides Singleton]
    fun provideLogin(retrofit: Retrofit):LoginService{
        return retrofit.create(LoginService::class.java)
    }


}