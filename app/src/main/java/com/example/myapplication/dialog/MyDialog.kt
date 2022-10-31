package com.example.myapplication.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import com.example.myapplication.R

class MyDialog  constructor(
    context: Context, themeResId: Int
) : Dialog(context,themeResId) {
    val mContext:Context
    init {
        mContext = context
    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return super.onTouchEvent(event) || activityClick(event)
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        val dispatchTouchEvent = super.dispatchTouchEvent(ev)
        if (!dispatchTouchEvent){
            activityClick(ev)
        }
        return dispatchTouchEvent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog)
        findViewById<View>(R.id.tv_click1).setOnClickListener {
            Toast.makeText(mContext,"点击了tv_click1",Toast.LENGTH_SHORT).show()
        }
        findViewById<View>(R.id.tv_click2).setOnClickListener {
            Toast.makeText(mContext,"点击了tv_click2",Toast.LENGTH_SHORT).show()
        }
    }
    fun activityClick(event: MotionEvent):Boolean{
       return (mContext as Activity)!!.dispatchTouchEvent(event)
    }

}