package com.example.retrofitapp.proxy.dynamicproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object tagert;  //设置被代理的对象

    public MyInvocationHandler(Object tagert) {
        this.tagert = tagert;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是动态代理----");
        return method.invoke(tagert,args);
    }




}
