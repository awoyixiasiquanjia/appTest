package com.example.myapplication.kotlin

fun main() {
    login_1(::getCall)  // ：：获取函数的引用对象
}

 fun getCall(content:String,code:Int){
}
fun  login_1(call:(String,Int)->Unit){

}


