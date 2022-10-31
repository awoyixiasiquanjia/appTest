package com.example.retrofitapp;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {
    private RetrofitUtils retrofitUtils;
    RetrofitApi retrofitApi;
    private RetrofitUtils() {
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                //修改请求头
                Request request = chain.request().newBuilder().addHeader("accessToken","16655613634921DDEpMnYrc").build();
                return chain.proceed(request);
            }
        }).build();
        Retrofit retrofit = new Retrofit.Builder().client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://test.readingpro.cn/readingpro-java/")
                .build();//builder建造造者模式
        retrofitApi = retrofit.create(RetrofitApi.class); //動態代理創建一個RetrofitApi接口實實現類
    }

   static class inClss {
     public   static RetrofitUtils retrofitUtils = new RetrofitUtils();
    }

    public static RetrofitApi getInstance(){
         return inClss.retrofitUtils.retrofitApi;
    }
}
