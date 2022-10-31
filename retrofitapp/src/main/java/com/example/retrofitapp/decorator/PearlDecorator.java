package com.example.retrofitapp.decorator;


//珍珠的装饰者
public class PearlDecorator extends BeverPrice {
    private BeverPrice beverPrice;
    @Override
    double cost() {
        System.out.println("加了珍珠后奶茶价格 "+ (2+beverPrice.cost()));
        return 2+beverPrice.cost();
    }

    public PearlDecorator(BeverPrice beverPrice) {
        this.beverPrice = beverPrice;
    }
}
