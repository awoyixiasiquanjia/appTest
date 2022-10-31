package com.example.myapplication.hilt

import android.content.Context
import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext

@Module
@InstallIn(ActivityComponent::class)
class PersonModule {

     @Provides
    fun getPerson(@ActivityContext context: Context,user: User):Person{
         Log.w("HiltComponentActivity","user=="+user.hashCode())
          return  Person()
    }

}