package com.day13;

import java.util.Random;
import java.util.Scanner;

//自学Random类，然后通过Random类来实现猜数字的小游戏。
public class Test09 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = r.nextInt(100);
            if (sc.nextInt() == a) {
                System.out.println("你猜对了");
                return;
            } else
                System.out.println("随机数:" + a);
        }



    }
}
