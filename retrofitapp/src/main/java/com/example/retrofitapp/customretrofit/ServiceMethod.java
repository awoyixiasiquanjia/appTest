package com.example.retrofitapp.customretrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Objects;

import retrofit2.http.GET;

public class ServiceMethod {
     private String path;
     private String Url;
     public Boolean isGet;

    public Boolean getGet() {
        return isGet;
    }

    public void setGet(Boolean get) {
        isGet = get;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public static ServiceMethod parseAnnotations(MyRetrofit myRetrofit, Method method) {
        Annotation[] methodAnnotations = method.getDeclaredAnnotations();
        ServiceMethod serviceMethod = new ServiceMethod();
        if (methodAnnotations[0] instanceof GET){
            serviceMethod.setGet(true);
            method.getGenericReturnType();
            serviceMethod.path = Objects.requireNonNull(((GET) methodAnnotations[0]).value());
            serviceMethod.setUrl(myRetrofit.baseUrl.url()+serviceMethod.path);
        }
        return serviceMethod;
    }
}
