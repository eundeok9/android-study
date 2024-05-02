package com.example.androidpractice

import dagger.BindsOptionalOf
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class FooModule {

    @BindsOptionalOf
    abstract fun obtinalFoo(): Foo
}