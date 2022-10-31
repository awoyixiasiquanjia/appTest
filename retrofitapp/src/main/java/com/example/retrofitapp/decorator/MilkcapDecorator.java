package com.example.retrofitapp.decorator;

import android.util.DisplayMetrics;

//加一个奶盖
public class MilkcapDecorator extends BeverPrice  {
    private BeverPrice beverPrice;

    @Override
    double cost() {
        System.out.println("加了奶盖后奶茶价格 "+ (1+beverPrice.cost()));
        return 1+beverPrice.cost();
    }

    public MilkcapDecorator(BeverPrice beverPrice) {
        this.beverPrice = beverPrice;
    }
}
