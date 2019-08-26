package com.day19;

import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date d = new Date(-l);
        System.out.println(d);
        Date d1 = new Date(0);
        System.out.println(d1.after(d));
        System.out.println(d1.before(d));
        System.out.println(d.getTime());
        d.setTime(l);
        System.out.println(d);
    }
}
