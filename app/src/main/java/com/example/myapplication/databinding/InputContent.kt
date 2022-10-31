package com.example.myapplication.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.library.baseAdapters.BR
import javax.inject.Inject


class InputContent :BaseObservable{
    var inputContent:String="输入的数据"

    @Bindable
    fun getStr():String{
        return this.inputContent
    }

   fun setStr(str:String){
      this.inputContent = str
       notifyPropertyChanged(com.example.myapplication.BR.showContent)
       notifyPropertyChanged(BR.showContent)
   }

    val nameF:ObservableField<String> by lazy {
        ObservableField<String> ()
    }

    @Inject
    constructor()
}