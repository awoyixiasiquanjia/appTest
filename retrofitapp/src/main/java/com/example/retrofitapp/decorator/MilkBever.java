package com.example.retrofitapp.decorator;


//一杯普通的饮料
public class MilkBever  extends BeverPrice{
    @Override
    public double cost() {
        System.out.println("奶茶价格 "+ 3);
        return 3;
    }
}
