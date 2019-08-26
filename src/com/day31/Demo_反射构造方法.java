package com.day31;

import java.lang.reflect.Constructor;

public class Demo_反射构造方法 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.day31.Person");
        //构造方法对象，具有参数类型
        Constructor con = c.getConstructor(String.class,int.class,String.class);
        //对象赋值
        Object obj = con.newInstance("jjj",34,null);

        System.out.println(obj);
    }
}
