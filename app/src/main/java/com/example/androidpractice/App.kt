package com.example.androidpractice

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App: Application() {

    val TAG = App::class.java.simpleName

    // 의존성 주입 요청
    @Inject
    lateinit var myName: MyName

    override fun onCreate() {
        super.onCreate() // 이때 의존성 주입이 발생함

        Log.e(TAG, "My name is $myName")
    }
}