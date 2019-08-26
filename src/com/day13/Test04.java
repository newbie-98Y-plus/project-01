package com.day13;

import java.util.Scanner;

//循环录入5位学员成绩，使用冒泡排序进行升序排列后输出结果（录屏）
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x = 0; x < arr.length-1; x++) {
            for (int j = 0; j < arr.length-x-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i1 : arr) {
            System.out.print(i1+" ");
        }

    }
}
