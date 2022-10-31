package com.example.retrofitapp.proxy;
import com.example.retrofitapp.proxy.dynamicproxy.MyInvocationHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;

public class MainTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //静态代理
//        HouseProxy houseProxy = new HouseProxy();
//        houseProxy.setClient(new Client());
//        houseProxy.buyHouse();
        //动态代理  ，第一种方式
//        Class<?> proxyClass = Proxy.getProxyClass(MainTest.class.getClassLoader(), BuyHourse.class); //得到代理得类对象
//        BuyHourse buyHourse = (BuyHourse) proxyClass.getConstructor(InvocationHandler.class).newInstance(new MyInvocationHandler(new Client()));
//        buyHourse.buyHouse();
        //jdk 1.8及以前
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //jdk1.8及以后
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        Client client = new Client();
//        //动态代理，第二种方式
//        BuyHourse o = (BuyHourse) Proxy.newProxyInstance(MainTest.class.getClassLoader(), new Class[]{BuyHourse.class}, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("走了动态代理===");
//                return method.invoke(client, args);
//            }
//        });
//        o.buyHouse();

        SellClient sellClient = new SellClient();
        SellHouse o = (SellHouse) Proxy.newProxyInstance(MainTest.class.getClassLoader(), new Class[]{BuyHourse.class, SellHouse.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("走了动态代理===");
                return method.invoke(sellClient, args);
            }
        });
        o.sellHouse("erer");

    }
}
