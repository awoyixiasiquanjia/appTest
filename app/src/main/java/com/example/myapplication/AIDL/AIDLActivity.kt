package com.example.myapplication.AIDL

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.commonlibrary.RxEventBus
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_aidlactivity.*

class AIDLActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aidlactivity)
        tv_injectprocess.setOnClickListener {
            RxEventBus.postAcrossApp("_procee_Name","我是发送的数据")
        }
    }
}