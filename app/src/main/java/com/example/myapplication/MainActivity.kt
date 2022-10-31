package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canvas_test)
        lifecycleScope.launch {
            Log.e("MainActivity==","--1----")
            lifecycleScope.async(Dispatchers.IO) {
                delay(1000)
                Log.e("MainActivity==","--2-thread----"+Thread.currentThread().name)
                Log.e("MainActivity==","--2----")
            }

            Log.e("MainActivity==","--3----")
            Log.e("MainActivity==","--3-thread----"+Thread.currentThread().name)
        }
        Log.e("MainActivity==","--4----")

    }

}