package com.example.myapplication.kotlin

//方法实现java的接口回调
fun main() {
    login("张三","123") {
            content: String, code: Int ->
         println("error=$content code=$code")
    }
}

fun login(userName:String,pwd:String,call:(String,Int)->Unit){
    if (UserName == userName && pwd== Pwd)
        call("登录成功",200)
       else
        call("登录失败",404)

}
const val UserName ="张三"
const val Pwd ="123"











