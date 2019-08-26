package com.day24;

import java.util.Scanner;

public class Throwable_异常一 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        test1(i);
    }
    public static void test1(int i) {
        test2(i);
    }
    public static void test2(int i) {
        try {
            int num = 10 / i;
            System.out.println(num);
            i = i + 1;
            System.out.println(i);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Dot't enter Zero");
        }
        System.out.println("hello world");
    }
}
