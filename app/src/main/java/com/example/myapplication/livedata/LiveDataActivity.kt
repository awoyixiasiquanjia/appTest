package com.example.myapplication.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.myapplication.R
import kotlin.concurrent.thread

class LiveDataActivity : AppCompatActivity() {
    lateinit var tv_text2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
         tv_text2 = findViewById<TextView>(R.id.tv_text2)
        findViewById<View>(R.id.tv_text1).setOnClickListener {
            LivaDataSinglon.myLiveData.value = 2
             Log.e("====","${LivaDataSinglon.myLiveData.value}")
        }
        findViewById<View>(R.id.tv_text3).setOnClickListener {
            LivaDataSinglon.myLiveData.observe(this) {
                tv_text2.setText("$it")
            }
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
        LivaDataSinglon.livadata.value = "发送的数据onPause"
    }

}