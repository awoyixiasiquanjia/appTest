package com.example.myapplication;

public class TestJava  {


    public static void main(String[] args) {
        Son son = new Son();
    }

    static class Person{

        public Person() {
            System.out.print("Person==");
        }

    }

    static class Son extends Person{

        public Son() {

            System.out.print("Son==");
        }

    }


}
