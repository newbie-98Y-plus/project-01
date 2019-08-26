package com.home02;
//1. 对byte,short,float,double进行自动拆箱和自动装箱
//2. byte和Integer之间能否进行自动拆箱和自动装箱
//3. 通过Byte获取byte的最大值
public class Integer01 {
    public static void main(String[] args) {
        byte b = 3;
        Byte b1 = b;
        Byte b2 = new Byte((byte) 0);
        b = b2;
        System.out.println(Byte.MAX_VALUE);

    }

}
