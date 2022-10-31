package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.random.Random

const val a:Int = 3

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        val tvContent = findViewById<TextView>(R.id.tv_content)

        findViewById<View>(R.id.tv_click).setOnClickListener {
            tvContent.setText("得到的值="+ ktA)
            val kotlinTest_1 = kotlinTest()
            val kotlinTest_2 = kotlinTest()

           Log.e("+++",kotlinTest_1.toString())
            Log.e("+++",kotlinTest_2.toString())
        }

    }
}