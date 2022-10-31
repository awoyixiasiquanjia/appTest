package com.example.retrofitapp.decorator;

public class MainTest {


    public static void main(String[] args) {
          //输出一个加了奶盖的奶茶
        MilkBever milkBever = new MilkBever();
        MilkcapDecorator milkcapDecorator = new MilkcapDecorator(milkBever);
       // milkcapDecorator.cost();
        //输出一个加了珍珠的奶茶
        PearlDecorator pearlDecorator = new PearlDecorator(milkBever);
       // pearlDecorator.cost();
        //输出一个加了珍珠和奶盖的奶茶
        PearlDecorator pearlDecorator2 = new PearlDecorator(milkcapDecorator);
        pearlDecorator2.cost();

    }
}
