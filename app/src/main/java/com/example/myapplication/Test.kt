package com.example.myapplication

import android.util.Log

const val ktA:Int =3

  fun kotlinTest():SingleKt{
   val s:SingleKt by lazy {
        System.out.println("方法初始化")
       SingleKt()
   }
   return s
}
