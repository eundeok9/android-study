package com.example.androidpractice

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyName(): MyName{
        // App과 MainActivity에서 동일한 uuid 가 호출됨
        Log.e("AppModule", "provideMyName 호출")
        return MyName()
    }
}