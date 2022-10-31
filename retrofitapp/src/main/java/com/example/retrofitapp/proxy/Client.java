package com.example.retrofitapp.proxy;


//客户
public class Client  implements BuyHourse{

    @Override
    public void buyHouse() {
         System.out.println("客户买房子");
    }

}
