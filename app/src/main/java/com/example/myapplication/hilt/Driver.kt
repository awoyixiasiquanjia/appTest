package com.example.myapplication.hilt

import android.util.Log
import javax.inject.Inject

//开车
class Driver @Inject constructor() :DoSomeThing {
    override fun doSomething() {
        Log.e("DoSomeThing","我去开车来了")
    }
}