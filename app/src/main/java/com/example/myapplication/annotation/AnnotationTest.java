package com.example.myapplication.annotation;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationTest {

    @Person(name = "sujinbao",age=24)
    HuMan huMan;
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws NoSuchFieldException {
        AnnotationTest annotationTest = new AnnotationTest();
        Class aClass = annotationTest.getClass(); //获取类对象
        Field huMan = aClass.getDeclaredField("huMan");
        Person declaredAnnotation = huMan.getDeclaredAnnotation(Person.class);
        System.out.print("declaredAnnotation="+declaredAnnotation);
        System.out.print("name="+declaredAnnotation.name());
        System.out.print("age="+declaredAnnotation.age());
    }
}
