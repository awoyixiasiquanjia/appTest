package com.example.myapplication.hilt

import android.util.Log
import javax.inject.Inject

//跳舞
class  DanceR @Inject constructor() : DoSomeThing {
    override fun doSomething() {
        Log.e("DoSomeThing","我去跳舞了")
    }

}