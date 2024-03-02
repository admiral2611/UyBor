package com.admiral26.uybor.core.di

import com.admiral26.uybor.core.repo.SignUpRepository
import com.admiral26.uybor.core.repo.UserInfoRepository
import com.admiral26.uybor.core.repo.VerificationRepository
import com.admiral26.uybor.core.repo.imp.SignUpRepositoryImp
import com.admiral26.uybor.core.repo.imp.UserInfoRepositoryImp
import com.admiral26.uybor.core.repo.imp.VerificationRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun bindSignUpRepository(repositoryImp: SignUpRepositoryImp): SignUpRepository

    @[Binds Singleton]
    fun bindVerificationRepository(repositoryImp: VerificationRepositoryImp): VerificationRepository

    @[Binds Singleton]
    fun bindUserInfoRepository(repositoryImp: UserInfoRepositoryImp): UserInfoRepository
}