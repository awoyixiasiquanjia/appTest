package com.example.myapplication.proxy_http_demo

import java.util.*
import kotlin.collections.HashMap


//okhttp的请求实现，这个不要让用户直接调用，让代理去代理，采用接口隔离原则来设计
class OkhttpClient : HttpClient {
    override fun doPost(url: String, map: HashMap<String, Objects>, callBack: CallBack) {
          //做完网络请求，然后返回结果
        callBack.onSuccess("请求数据成功")
    }

    override fun doGet(url: String, callBack: CallBack) {
        callBack.onSuccess("请求数据成功")
    }

}