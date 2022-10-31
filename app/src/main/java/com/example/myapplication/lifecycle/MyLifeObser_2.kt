package com.example.myapplication.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import javax.inject.Inject

class MyLifeObser_2  @Inject constructor(): LifecycleObserver {

   @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
   fun onCreat(){
   }

}