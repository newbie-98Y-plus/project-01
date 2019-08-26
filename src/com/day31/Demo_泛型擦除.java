package com.day31;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo_泛型擦除 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(666);
        //获取al的运行时类
        Class c = al.getClass();
        //获取成员方法
        Method me = c.getMethod(new Scanner(System.in).nextLine(),Object.class);
        //执行
        me.invoke(al,"abc");
        System.out.println(al);
    }
}
