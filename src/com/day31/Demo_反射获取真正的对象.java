package com.day31;

import java.util.Scanner;

public class Demo_反射获取真正的对象 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();
        //获取字节码对象
        Class c = Class.forName(className);
        //获取真正的对象
        Object obj = c.newInstance();

        System.out.println(c.getPackage());
        System.out.println(c.getConstructor());

        System.out.println(c.getName());
        System.out.println(obj);
    }
}
