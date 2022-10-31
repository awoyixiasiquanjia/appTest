package com.example.myapplication.proxy_http_demo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.hiltdemo.OkhttpClientProxy
import java.util.*
import kotlin.collections.HashMap
class HttpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http)
        findViewById<View>(R.id.tv_getdata).setOnClickListener{
           OkhttpClientProxy.init(OkhttpClient())
            var map= HashMap<String,Objects>()
            OkhttpClientProxy.mHttpClient.doPost("",map, object :CallBack{
                override fun onSuccess(data: String) {
                    Log.e("HttpActivity","HttpActivity==onSuccess")
                }
                override fun onFail(code: Int) {

                }
            })

        }
    }
}