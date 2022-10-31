package com.example.myapplication.livedata

import androidx.arch.core.internal.SafeIterableMap
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import java.lang.reflect.Field
import java.lang.reflect.Method

//去掉粘性事件的 MutableLiveData
class MyMutableLiveData<T> : MutableLiveData<T> {
    var isStick:Boolean
   constructor(isStick: Boolean = true):super(){
      this.isStick  = isStick
   }
   override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
      super.observe(owner, observer)
      if (isStick){
         return
      }

      //获得当前mVersion
      val superClass =  this.javaClass.superclass.superclass
      //或者
     // val superClass = LiveData::class.java
      val mVersionClass :Field = superClass.getDeclaredField("mVersion")
       mVersionClass.isAccessible = true
      val mVersion = mVersionClass.get(this)  //获取当前对象的mVersion值

      //mLastVersion
     val liveDataClass =  LiveData::class.java //获取类对象  对象获取的话用 xxx.javaClass 或者XXX::class.java  / Person::class 获取的是kt的class对象
      val safeIterableMapClass :Field= liveDataClass.getDeclaredField("mObservers")
      safeIterableMapClass.isAccessible = true //设置可以访问私有属性
      val mSafeIterableMap = safeIterableMapClass.get(this)  //获取HashMap
      val mSafeIterableMapclass = mSafeIterableMap.javaClass
      val get:Method = mSafeIterableMapclass.getDeclaredMethod("get",Any::class.java)
      //或者
     // val declaredMethod:Method = mSafeIterableMapclass.getDeclaredMethod("get",Any::class.java)
      get.isAccessible =true
      //Entry<out K, out V 相当于 java的 xx extend B  in 相当于 java的 xx super B
      //val entry: kotlin.collections.Map.Entry<*,*> = get.invoke(mSafeIterableMap, observer) as kotlin.collections.Map.Entry<*, *>
      val entry:Any = get.invoke(mSafeIterableMap, observer)
      var  observerWrapper:Any?=null
      if (entry!=null && entry is Map.Entry<*,*> ){
         observerWrapper =   entry.value
      }
      val observerWrappersuperclass:Class<*> = observerWrapper?.javaClass?.superclass!!
      val declaredField = observerWrappersuperclass?.getDeclaredField("mLastVersion")
      declaredField.isAccessible=true
      declaredField.set(observerWrapper,mVersion)
//      var mLastVersion = declaredField.get(observerWrapper)
//      mLastVersion  = mVersion

   }


}