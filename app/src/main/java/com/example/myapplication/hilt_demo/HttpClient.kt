package com.example.myapplication.hilt_demo

import java.util.*
import kotlin.collections.HashMap

//做网络请求的统一实现接口，用来给okhttp，或者其他网络请求来实现    请求模板
interface HttpClient {
    fun doPost(url:String,map: HashMap<String,Objects>,callBack: CallBack)
    fun doGet(url: String,callBack: CallBack)
}