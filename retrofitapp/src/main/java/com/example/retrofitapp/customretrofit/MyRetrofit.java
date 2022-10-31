package com.example.retrofitapp.customretrofit;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nullable;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class MyRetrofit {

    final HttpUrl baseUrl;
    final OkHttpClient okHttpClient;
    private final Map<Method, ServiceMethod> serviceMethodCache = new ConcurrentHashMap<>();

     MyRetrofit(HttpUrl baseUrl,OkHttpClient okHttpClient) {
        this.baseUrl = baseUrl;
        this.okHttpClient =okHttpClient;
    }

    public <T> T create(Class<T> service) {
      return  (T)Proxy.newProxyInstance(MyRetrofit.class.getClassLoader(), new Class<?>[]{service}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                loadServiceMethod(method);
                return invokeMethod(method,args);
            }

        });
    }

    private Object invokeMethod(Method method, Object[] args) {
        ServiceMethod serviceMethod = serviceMethodCache.get(method);
        Request request = new Request.Builder().url(serviceMethod.getUrl()).get().build();
        return okHttpClient.newCall(request);
    }

    private void loadServiceMethod(Method method) {
        ServiceMethod serviceMethod = serviceMethodCache.get(method);
        if (serviceMethod !=null){
        }else{
            ServiceMethod serviceMethod1 = ServiceMethod.parseAnnotations(this, method);
            serviceMethodCache.put(method,serviceMethod1);
        }

    }

    public static final class  Builder{
        private @Nullable HttpUrl baseUrl;
        public Builder setBaseUrl(String baseUrl ){
            //Objects.requireNonNull(baseUrl)
            this.baseUrl=HttpUrl.get(Objects.requireNonNull(baseUrl));
            return this;
        }

        public MyRetrofit build(){
            OkHttpClient okHttpClient = new OkHttpClient();
            return  new MyRetrofit(baseUrl,okHttpClient);
        }

    }


}
