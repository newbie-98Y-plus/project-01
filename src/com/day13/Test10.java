package com.day13;

import java.util.Random;

//自学Random类，然后通过Random类来实现本班级的随机点名器
public class Test10 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(43);
        System.out.println("随机点名:"+(a+1));
    }
}
