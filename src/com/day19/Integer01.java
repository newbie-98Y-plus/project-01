package com.day19;

import java.util.Scanner;

public class Integer01 {
    public static void main(String[] args) {
        Integer i1 = new Integer(6666);
        System.out.println(i1 - 10);

        Integer i2 = new Integer("777");
        System.out.println(i2 - 10);

        Integer i3 = new Integer(i1+i2);
        System.out.println(i3 - 10);

        int i = i3.intValue();
        System.out.println(i);

        byte b = i3.byteValue();
        System.out.println(b);

        double d = i3.doubleValue();
        System.out.println(d);

        boolean c = i3.equals(7443);
        System.out.println(c);

        Integer i4 = new Integer(256);
        byte b1 = i4.byteValue();
        System.out.println(b1);

        int i5 = i4.intValue();
        System.out.println(i5);

        String str = new Scanner(System.in).nextLine();
        int i6 = new Integer(str);
        System.out.println(i6 + 1);


    }
}
