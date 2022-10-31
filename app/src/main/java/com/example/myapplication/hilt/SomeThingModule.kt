package com.example.myapplication.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
abstract class SomeThingModule {

    @Binds
    abstract fun bindSomathing(dance:DanceR):DoSomeThing

}