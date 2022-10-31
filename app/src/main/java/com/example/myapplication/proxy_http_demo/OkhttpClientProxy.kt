package com.example.myapplication.hiltdemo

import com.example.myapplication.proxy_http_demo.CallBack
import com.example.myapplication.proxy_http_demo.HttpClient
import java.util.*
import kotlin.collections.HashMap

class OkhttpClientProxy :HttpClient {


    override fun doPost(url: String, map: HashMap<String, Objects>, callBack: CallBack) {
        TODO("Not yet implemented")
    }

    override fun doGet(url: String, callBack: CallBack) {
        TODO("Not yet implemented")
    }

    companion object{
        lateinit var  mHttpClient : HttpClient
        fun init(httpClient :HttpClient ){
            mHttpClient = httpClient
        }
    }

}