package com.example.myapplication

import android.util.Log
import javax.inject.Inject

class Truck  constructor(var dirver: String) {

    @Inject
    constructor() : this("张三") {
    }


    fun deliver(){
        Log.e("truck",dirver+"去运送了货物")
    }
}