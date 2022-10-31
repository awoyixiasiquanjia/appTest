package com.example.mydaggerapplication.dagger;

public enum Student_Factory implements Factory<User>{
    INSTAnce;

    @Override
    public User get() {
        return new User();
    }

    public static Factory creat(){
        return INSTAnce;
    }

}
