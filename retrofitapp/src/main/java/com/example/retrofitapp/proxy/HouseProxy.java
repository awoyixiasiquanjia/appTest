package com.example.retrofitapp.proxy;



//静态代理实现帮客户买房子，AOP思想
public class HouseProxy  implements BuyHourse{

    private BuyHourse client;

    public void setClient(BuyHourse client){
            this.client =  client;
    }

    @Override
    public void buyHouse() {
        System.out.println("客户开始挑选房子");
        client.buyHouse();
        System.out.println("客户买完房子了");
    }
}
