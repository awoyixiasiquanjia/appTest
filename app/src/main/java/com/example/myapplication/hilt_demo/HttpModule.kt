package com.example.myapplication.hilt_demo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
 abstract class HttpModule {


  @Binds
  abstract fun getHttpClient(
      okhttpClient: OkhttpClient
  ):HttpClient

}