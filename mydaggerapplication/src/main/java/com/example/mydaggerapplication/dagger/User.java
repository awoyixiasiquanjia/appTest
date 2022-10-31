package com.example.mydaggerapplication.dagger;

import com.example.mydaggerapplication.MySingleton;

import javax.inject.Inject;
import javax.inject.Singleton;

@MySingleton
public class User {
    private String userName;
    private int age;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Inject
    public User() {
    }
    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
