package com.day31;

import java.lang.reflect.Method;

public class Demo_反射获取成员方法 {
    public static void main(String[] args)throws Exception {
        Class c = Class.forName("com.day31.Person");
        Object obj = c.newInstance();
        //获取成员方法setName,参数类型String
        Method me = c.getMethod("setName", String.class);
        //执行方法
        Object tt =  me.invoke(obj,"狮鹫");

        Method me1 = c.getMethod("getName");
        Object t2 = me1.invoke(obj);
        System.out.println(t2);

        System.out.println(obj);
        System.out.println(tt);

    }
}
