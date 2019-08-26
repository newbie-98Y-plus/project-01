package com.day26;

import java.math.BigInteger;
import java.util.Scanner;

public class Test_递归 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long s = System.currentTimeMillis();
        System.out.println(shulie(i));
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
    public static BigInteger shulie(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.valueOf(1);
        }else {
            return shulie(n-1).add(shulie(n-2)) ;
        }
    }
}
