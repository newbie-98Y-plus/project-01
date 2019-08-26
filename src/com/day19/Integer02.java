package com.day19;

public class Integer02 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("100",2));
        System.out.println(Integer.parseInt("100",8));
        System.out.println(Integer.parseInt("100",10));
        System.out.println(Integer.parseInt("100",16));
        int i = 10;
        //Integer it = Integer(i);//装箱
        Integer it = i;//自动装箱

        Integer it2 = new Integer(1);
       // int i1 = it2.intValue();//拆箱
        int i1 = it2;//自动拆箱

        it = it + i1;//先自动拆箱，再自动装箱
        System.out.println(it);

        Byte b = new Byte((byte) 2);
        System.out.println(b.SIZE);

        Boolean bl = new Boolean(true);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
