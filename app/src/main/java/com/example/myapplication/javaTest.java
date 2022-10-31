package com.example.myapplication;

import com.example.myapplication.hilt.User;
import com.example.myapplication.lifecycle.EmptyFragment;
import com.example.myapplication.lifecycle.LifeCycleOwner;
import com.example.myapplication.lifecycle.MyState;
import com.example.myapplication.lifecycle.States;
import com.example.myapplication.lifecycle.UserInfo;

public class javaTest {
    private static final int MODE_SHIFT = 30;
///    二进制
//             1  1  1  1  1  1  1

  //           64   32   16   8   4   2    0

 //           30的二进制

 //          0011110

    public static void main(String[] args) {

        System.out.println("ordinal="+ UserInfo.WANGWU.compareTo(UserInfo.LISI));
        System.out.println("name="+ UserInfo.LISI.name());

//     int   EXACTLY     = 1 << MODE_SHIFT;     //
//
//        Integer olgAge = 3;
//
//        new TestJava.Person().hashCode();
//
//      System.out.print("olgAge == "+olgAge.hashCode());

    }

//    static class Person_{
//
//    }

}
