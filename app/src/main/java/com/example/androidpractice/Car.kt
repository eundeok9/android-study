package com.example.androidpractice

import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine
) {
}