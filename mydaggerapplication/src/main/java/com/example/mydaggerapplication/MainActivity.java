package com.example.mydaggerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mydaggerapplication.dagger.DaggerUserComponent;
import com.example.mydaggerapplication.dagger.Factory;
import com.example.mydaggerapplication.dagger.MyTestEnum;
import com.example.mydaggerapplication.dagger.Student_Factory;
import com.example.mydaggerapplication.dagger.User;
import com.example.mydaggerapplication.dagger.UserComponent;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    @Inject
    User user1;

    @Inject
    User user2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserComponent.builder().build().inject(this);
        Log.d("MainActivity", "user="+user.hashCode());
        Log.d("MainActivity", "user1="+user1.hashCode());
        Log.d("MainActivity", "user1="+user2.hashCode());
        if ( MyTestEnum.TEST ==MyTestEnum.TEST_3){
        }
    }
}