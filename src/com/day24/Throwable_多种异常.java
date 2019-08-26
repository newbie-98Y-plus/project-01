package com.day24;

import java.util.Scanner;

public class Throwable_多种异常 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num = 1/ sc.nextInt();
            System.out.println(num);
            System.exit(0);

            int[] arr = {1,2,3};
            System.out.println(arr[sc.nextInt()]);

            arr = null;
            System.out.println(arr.length);
            return;
        }catch (ArithmeticException ae) {
            System.out.println("0不能作为除数");
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("数组异常");
        }finally {
        System.out.println("我一定会出现的斯贝塔");
        }
    }
}
