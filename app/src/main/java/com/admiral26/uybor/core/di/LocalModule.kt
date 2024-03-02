package com.admiral26.uybor.core.di

import android.content.Context
import com.admiral26.uybor.core.cache.LocalStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalModule {


    @Provides
    @Singleton
    fun provideLocalDataCache(@ApplicationContext context:Context):LocalStorage{
        return LocalStorage(context)
    }


}