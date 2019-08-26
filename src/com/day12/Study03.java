package com.day12;

import java.util.Scanner;

public class Study03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int [] a = new int [3];
        for (int i = 0; i < arr.length; i++) {
            a[i] = (int) (Math.random()*10);
            System.out.print(a[i]);
            if (a[i] == arr[i]) {
                count++;
            }
        }
         switch (count){
             case 0:
                 System.out.println("坚持,幸运会属于你的!");
                 break;
             case 1:
                 System.out.println("恭喜您,您的奖金是10元");
                 break;
             case 2:
                 System.out.println("恭喜您,您的奖金是40元");
                 break;
             default:
                 System.out.println("恭喜您,您的奖金是160元");
         }
    }
}
