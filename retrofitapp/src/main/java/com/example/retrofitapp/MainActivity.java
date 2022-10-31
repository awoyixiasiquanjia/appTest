package com.example.retrofitapp;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.example.retrofitapp.customretrofit.MyRetrofit;
import com.example.retrofitapp.databinding.ActivityMainBinding;

import java.util.HashMap;

import javax.inject.Inject;

import dagger.hilt.InstallIn;
import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

   MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Handler mhandler = new Handler(Looper.getMainLooper()){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
            }
        };
         mhandler.post(new Runnable() {
             @Override
             public void run() {
                 Log.e("++++","---------------23");
             }
         });
        Log.e("++++","---------------5555");
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewDataBinding.setVm(mainViewModel);
        mainViewModel.getGson();
        float dimension = getResources().getDimension(R.dimen.dp_160);
        viewDataBinding.tvTest.setText("=="+dimension);

        viewDataBinding.tvTest.post(new Runnable() {
            @Override
            public void run() {
                int width = viewDataBinding.tvTest.getWidth();
                Log.e("++++","with=="+width);
            }
        });

        mainViewModel.startAc.observe(this, new Observer<ArouterPath>() {
            @Override
            public void onChanged(ArouterPath arouterPath) {
                startActivity(new Intent(MainActivity.this,arouterPath.getToName()));
            }
        });
        Log.e("++++","---------------6666");
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}