package com.example.myapplication.proxy_http_demo

//请求接口的回调
interface CallBack {
    fun onSuccess(data:String)
    fun onFail(code:Int)
}