package com.day13;

import java.util.Scanner;

//使用数组求学生的平均分。键盘录入3个学生的成绩，
// 存入到数组中保存，求数组中的所有元素的和，然后求出平均数。（录屏）
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
             sum = sum + arr[i];
        }
        System.out.println(sum/3);

    }
}
