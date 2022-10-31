package com.example.myapplication.reflex;

import android.util.Log;

public class AnnotationReflexTEst<T> extends animal{
     String name;
     private int age;

     @Reflex
      String sex;

    public void printType(T s){
        System.out.println("打印T的结果=="+s);
    }

    public void printType(String s){
        System.out.println("打印String的结果=="+s);
    }

    private String getName() {
        return name;
    } //私有方法

    private void setName(String name) {
        this.name = name;
    }  //私有属性

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "AnnotationReflexTEst{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
