package com.day24;

import java.util.Scanner;

public class Throwable_异常三 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            System.out.println(i / i);//可能出现异常,不影响finally中的语句
        }finally {
            Scanner sc1 = new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println(i * i);
        }
    }
}
