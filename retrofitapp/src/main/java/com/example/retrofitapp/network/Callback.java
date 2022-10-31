package com.example.retrofitapp.network;

public interface Callback<T> {

    void onResponse(T response);

    void onFailure(Throwable e);

}
