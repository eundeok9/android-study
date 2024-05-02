package com.example.androidpractice

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App: Application() {

    val TAG = App::class.java.simpleName

    override fun onCreate() {
        super.onCreate() // 이때 의존성 주입이 발생함
    }
}