package com.day14;


import java.util.Date;

public class Syudy06 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("hello");
        }
        long ll = System.currentTimeMillis();
        System.out.println(ll-l);
        Date date = new Date(0);
        System.out.println(date);
    }
}
