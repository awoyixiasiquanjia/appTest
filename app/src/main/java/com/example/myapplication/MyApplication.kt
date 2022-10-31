package com.example.myapplication

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication :Application{
    constructor() : super()
    override fun onCreate() {
        super.onCreate()
         Log.e("MyApplication","=====MyApplication")
         registerActivityLifecycleCallbacks(activityLifecycleCallbacks)
    }


    val activityLifecycleCallbacks:ActivityLifecycleCallbacks=   object:ActivityLifecycleCallbacks{

        private var activityStartCount = 0
        override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        }

        override fun onActivityStarted(activity: Activity) {
            activityStartCount++
            if(activityStartCount==1){
                //从后台切换到前台
            }

        }

        override fun onActivityResumed(activity: Activity) {
        }

        override fun onActivityPaused(activity: Activity) {
        }

        override fun onActivityStopped(activity: Activity) {
            activityStartCount--
            if (activityStartCount == 0){
                //从前台切换到后台
            }
        }

        override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        }

        override fun onActivityDestroyed(activity: Activity) {
        }

    }
}