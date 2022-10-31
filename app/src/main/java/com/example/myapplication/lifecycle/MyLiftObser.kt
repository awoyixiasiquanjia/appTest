package com.example.myapplication.lifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import javax.inject.Inject

class MyLiftObser @Inject constructor() :DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        fun onStart() = Log.e("======","===onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        fun onStart() = Log.e("======","===onStart")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        fun onStart() = Log.e("======","===onStop")
    }
}