package com.example.myapplication.viewbind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_hilt_main.*
import kotlinx.android.synthetic.main.activity_viewding_kotlin.*
import kotlinx.android.synthetic.main.activity_viewding_kotlin.tv_text1
import kotlinx.android.synthetic.main.activity_viewding_kotlin.tv_text2

class viewding_kotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewding_kotlin)

        tv_text1.text = "我是绑定机制设置的"
        tv_text2.text ="dfdsfsdfffsf"
        tv_text6.text ="我不是这个布局的"
    }
}