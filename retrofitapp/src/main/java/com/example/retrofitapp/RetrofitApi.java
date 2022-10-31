package com.example.retrofitapp;
import com.example.retrofitapp.bean.MainPageBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

interface RetrofitApi {

    @GET("/article/list/0/json")
    Call<ResponseBody> listRepos();

//    @FormUrlEncoded
//    @POST("rpHomePage/v1/getHomePageList.shtml")
//    Call<HttpResultNew<MainPageBean>> getHomePageList(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("rpHomePage/v1/getHomePageList.shtml")
    Observable<HttpResultNew<MainPageBean>> getHomePageList(@FieldMap Map<String, Object> map);


}