package com.example.myapplication.hilt_demo

//请求接口的回调
interface CallBack {
    fun onSuccess(data:String)
    fun onFail(code:Int)
}