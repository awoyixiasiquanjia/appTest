package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityViewBindBinding

class ViewBindActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_view_bind)
        val inflate = ActivityViewBindBinding.inflate(layoutInflater)   //将LayoutInflater传入
        setContentView(inflate.root)  //将根布局传入
        inflate.tv2.text = "我是通过viewbinding获取的"  //使用
        inflate.tv1.text="阿发"

    }
}