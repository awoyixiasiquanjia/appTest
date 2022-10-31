package com.example.mydaggerapplication.dagger;


import dagger.Module;
import dagger.Provides;


@Module
public class UserModule {
    @Provides
    public User getUserBean(){
        return new User("张三",23);
    }

}
