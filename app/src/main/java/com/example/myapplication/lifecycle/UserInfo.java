package com.example.myapplication.lifecycle;

public enum UserInfo {
    ZHANSANG("张三",23),
    LISI("李四",24),
    WANGWU("王五",23);
    private String name;
    private int age;

     UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
