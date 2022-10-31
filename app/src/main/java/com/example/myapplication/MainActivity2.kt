package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.hilt.DoSomeThing
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


//创建一个对象的依赖注入
@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {
    @Inject
    lateinit var truck: Truck

    @Inject
    lateinit var dosomething:DoSomeThing

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<View>(R.id.jump).setOnClickListener {
            truck.deliver()
        }

        findViewById<View>(R.id.jump_1).setOnClickListener {
            dosomething.doSomething()
        }

    }
}