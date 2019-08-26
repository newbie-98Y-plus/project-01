package com.study;


import java.util.Arrays;

public class Test03_二分查找 {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        //升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //二分查找
        int result = erserch(arr,120);
        System.out.println(result);

    }
    public static int erserch(int[] arr,int value) {
        int min = 0;
        int max = arr.length - 1;
        int middle = (max + min) / 2;
        while (arr[middle] != value) {
            if(arr[middle] > value) {
                max = middle - 1;
            }else
                min = middle + 1;
            middle = (max + min) / 2;
            if(min > max)
                return -1;
        }
        return middle;
    }
}
