package com.example.myapplication.databinding

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class DatabindActivity : AppCompatActivity() {

    @Inject
    lateinit var mShowContent:InputContent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_databind)
        val contentView = DataBindingUtil.setContentView<ActivityDatabindBinding>(
            this,
            R.layout.activity_databind
        )
        //contentView ,可以设置点击事件
        contentView.showContent =mShowContent
        Handler().postDelayed ({
             mShowContent.setStr("我来需要改三个月后又了")
        },3000)

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }


}