package com.example.androidpractice

import java.util.UUID
import javax.inject.Inject

// MyName이라는 의존성을 컴포넌트에 바인딩 하겠다라는 의미
class MyName {
    private val uuid = UUID.randomUUID()

    override  fun toString(): String {
        return uuid.toString()
    }

}