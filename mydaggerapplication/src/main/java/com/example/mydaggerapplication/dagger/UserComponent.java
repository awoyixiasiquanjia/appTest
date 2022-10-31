package com.example.mydaggerapplication.dagger;


import com.example.mydaggerapplication.MainActivity;
import com.example.mydaggerapplication.MySingleton;

import javax.inject.Singleton;

import dagger.Component;

@MySingleton
@Component()
public interface UserComponent {

    void inject(MainActivity mainActivity);

}
