package com.example.myapplication.hilt_demo
import dagger.hilt.android.scopes.ActivityScoped
import java.util.*
import javax.inject.Inject
import kotlin.collections.HashMap

class OkhttpClientProxy @Inject constructor()  :HttpClient{

    @Inject
    lateinit var mHttpClient:HttpClient

    override fun doPost(url: String, map: HashMap<String, Objects>, callBack: CallBack) {
        mHttpClient.doPost(url,map,callBack)
    }

    override fun doGet(url: String, callBack: CallBack) {

    }

}