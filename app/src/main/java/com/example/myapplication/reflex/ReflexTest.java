package com.example.myapplication.reflex;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflexTest {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws Exception {
        AnnotationReflexTEst<String> annotationReflexTEst = new AnnotationReflexTEst();
        Class  AnnotationReflexTEst_class =  AnnotationReflexTEst.class;
        Method method = AnnotationReflexTEst_class.getDeclaredMethod("printType",String.class);
        Class<?> declaringClass = method.getDeclaringClass();
        System.out.println("mclass="+declaringClass);
        Method method2 = AnnotationReflexTEst_class.getDeclaredMethod("printType",Object.class);
        method.invoke(annotationReflexTEst,"我在测试呢");
        method2.invoke(annotationReflexTEst,"我在测试呢");
//        Class<? extends AnnotationReflexTEst> aClass = annotationReflexTEst.getClass(); //获得类对象
//        try {
//            //反射给java对象的属性赋值
//            //第一种
//            Field name = aClass.getDeclaredField("name");
//            name.set(annotationReflexTEst,"张三"); //属性不能私有，私有了，反射也搞不定
//            Field age = aClass.getDeclaredField("age");
//            age.setAccessible(true); //设置私有属性可以修改
//            age.set(annotationReflexTEst,23);
//            int realAge = (int) age.get(annotationReflexTEst);
//            //第二种,调用方法赋值
//            Method setName = aClass.getMethod("setName", String.class);
//            setName.invoke(annotationReflexTEst,"李四"); //这种很好的针对私有属性
//            //给拥有Reflex注解的属性赋值，对标dagger的实现
//            Field[] fields = aClass.getDeclaredFields();
//            for (Field str: fields) {
//                Reflex[] reflex = str.getAnnotationsByType(Reflex.class);
//                if (reflex!=null&&reflex.length!=0){
//                    str.set(annotationReflexTEst,"我是男的");
//                }
//
//            }
//            System.out.println("annotationReflexTEst="+annotationReflexTEst);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
