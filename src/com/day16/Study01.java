package com.day16;

import java.util.Scanner;

public class Study01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                break;
            }else {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);

    }
}
