package com.example.myapplication.hilt_demo
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class HiltHttpActivity : AppCompatActivity() {

    @Inject
    lateinit var OkhttpClientProxy:OkhttpClientProxy

   var content:String = "wrr"


    lateinit var user:User



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_http)
        user = User()
        user.hashCode()

        Person().toString()

        findViewById<View>(R.id.tv_getdata).setOnClickListener {
            val map = HashMap<String ,Objects>()
            OkhttpClientProxy.doPost("",map,object:CallBack{
                override fun onSuccess(data: String) {
                    Log.e("HiltHttpActivity","=====")
                }

                override fun onFail(code: Int) {
                }

            })

        }

    }
}