package com.example.myapplication.viewmode.example

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewmodel : ViewModel() {

     var phoneInfo:MutableLiveData<String> = MutableLiveData()

    init {
        phoneInfo.value = "设置电话号码"
    }


    fun addPhoneNumber(number: Int){
        phoneInfo.value = phoneInfo.value +number
    }



}