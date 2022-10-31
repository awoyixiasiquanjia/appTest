package com.example.myapplication.livedata

import androidx.lifecycle.MutableLiveData

object   LivaDataSinglon {

     val livadata:MutableLiveData<String> by lazy {
          MutableLiveData()
     }

     val myLiveData:MyMutableLiveData<Int> by lazy {
          MyMutableLiveData<Int>(false)
     }
}