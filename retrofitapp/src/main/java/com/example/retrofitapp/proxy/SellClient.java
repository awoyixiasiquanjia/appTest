package com.example.retrofitapp.proxy;

public class SellClient implements SellHouse{
    @Override
    public void sellHouse(String path) {
        System.out.println("买房子==="+path);
    }
}
