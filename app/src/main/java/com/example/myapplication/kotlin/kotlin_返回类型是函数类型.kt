package com.example.myapplication.kotlin

fun main() {
   val callMethod = callMethod()

    println("${callMethod("4")}")
}

//fun callMethod():(name:String )->String{
//    return {x:String-> "我是返回函数的值=$x"}  //直接返回一个匿名函数
//}

fun callMethod():(name:String )->String{
    return ::getMethod   //返回一个函数的引用
}


fun callMethod1():(name:String )->String{
    return {x:String-> "我是返回函数的值=$x"}
}
fun getMethod(name:String):String{
    return "我是返回值=$name"
}