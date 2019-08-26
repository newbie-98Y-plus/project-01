package com.day31;

import java.lang.reflect.Field;

public class Demo_暴力反射 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.day31.Person");
        //创建对象
        Object obj = c.newInstance();
        //获取所有name属性，无论私有公有
        Field f = c.getDeclaredField("name");
        //设置访问权限
        f.setAccessible(true);
        //为obj对象的name属性赋值
        f.set(obj,"丑八怪");
        Field f2 = c.getDeclaredField("sex");
        f2.setAccessible(true);
        f2.set(obj,"♀");
        Field f3 = c.getField("age");
        f3.set(obj,58);

        System.out.println(obj);
    }
}
