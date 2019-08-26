package com.day31;

import java.lang.reflect.Field;

public class Demo_反射获取成员变量 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("lisi",33,"♂");
        testField(p);
        System.out.println(p);


    }
    public static void testField(Object obj) throws NoSuchFieldException, IllegalAccessException {
        //获取对象的字节码对象
        Class c = obj.getClass();
        //获取成员变量类型的age属性
        Field f = c.getField("age");
        //获取指定对象obj上，该字段的值
        Object o = f.get(obj);
        System.out.println(o);
        //修改指定对象obj上，该字段的值
        f.set(obj,26);
    }
}
