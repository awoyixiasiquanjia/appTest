package com.example.myapplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

    public static void main(String[] args) {
           new C().getName();
    }


    static class C extends B {
        public void getName(){
            System.out.println("C=====");
            super.getName();
        }
    }




    static class B extends A{
        public void getName(){
            System.out.println("B=====");
            super.getName();
        }
    }


    static class A {
        public void getName(){
            System.out.println("A=====");
        }


    }

}
