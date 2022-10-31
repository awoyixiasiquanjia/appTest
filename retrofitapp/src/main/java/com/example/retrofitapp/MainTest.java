package com.example.retrofitapp;



//  instance   superclass isAssignableFrom 的区别
public class MainTest {
    public static void main(String[] args) {
        System.out.println("maintest="+A.class);
        System.out.println("maintest="+(A.class == A.class));
        System.out.println("superclass="+(D.class.getSuperclass()));
        System.out.println("isAssignableFrom="+(A.class.isAssignableFrom(C.class)));
        System.out.println("isAssignableFrom="+(B.class.isAssignableFrom(D.class)));
    }

    interface  A {
        void test1();
    }
    class B {

    }
    class C extends B implements A{
        @Override
        public void test1() {

        }
    }
    class D extends C {

    }

}

