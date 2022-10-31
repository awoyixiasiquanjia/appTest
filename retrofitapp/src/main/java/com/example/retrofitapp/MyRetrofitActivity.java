package com.example.retrofitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.retrofitapp.customretrofit.MyRetrofit;
import com.example.retrofitapp.databinding.ActivityMyRetrofitBinding;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MyRetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_my_retrofit);
        ActivityMyRetrofitBinding inflate = ActivityMyRetrofitBinding.inflate(getLayoutInflater());
        setContentView(inflate.getRoot());
        MyRetrofit myRetrofit = new MyRetrofit.Builder().setBaseUrl("https://www.wanandroid.com").build();
        RetrofitApi retrofitApi = myRetrofit.create(RetrofitApi.class);
        inflate.tvGetdata.setOnClickListener(v -> {
            OKgetGson();
//            retrofitApi.listRepos().enqueue(new Callback() {
//                @Override
//                public void onFailure(Call call, IOException e) {
//
//                }
//
//                @Override
//                public void onResponse(Call call, Response response) throws IOException {
//                    Log.e("====",response.toString());
//                }
//            });
        });

    }

    public void OKgetGson(){
//        Request request = new Request.Builder().get().url("https://www.wanandroid.com/article/list/0/json").build();
//
//        OkHttpClient okHttpClient = new OkHttpClient();
//        Call call = okHttpClient.newCall(request);
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                   Log.e("okhttp","response="+response + "\r\n线程="+Thread.currentThread().getName() );
//                ResponseBody responseBody = response.body();
//
//            }
//        });
    }


}