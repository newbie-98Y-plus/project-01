package com.day29;

import java.awt.*;
import java.util.ArrayList;

public class Demo_线程安全问题 {
    private static int i = 1000;
    public static void main(String[] args) {
        i = i + 100;
        ArrayList al = new ArrayList();
        al.add(i);
        System.out.println(i);
        Thread t1 = new Thread() {
            @Override
            public void run() {
               i = i + 100;
               al.add(i);
                System.out.println(i);
            }
        };
         Thread t2 = new Thread() {
             @Override
             public void run() {
                 System.out.println(al);
             }
         };
         t2.setDaemon(true);
         t1.start();
         t2.start();
    }
}
