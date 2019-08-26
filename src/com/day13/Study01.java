package com.day13;

import java.util.Arrays;

public class Study01 {
    public static void main(String[] args) {
        int[] arr = {33,45,78,345,120};
        int[] brr = new int[10];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(brr,333);
        System.out.println(Arrays.toString(brr));
        Arrays.fill(arr,777);
        System.out.println(Arrays.toString(arr));




        /*ArrayTool.printarr(arr);
        System.out.println(ArrayTool.getMax(arr));
        ArrayTool.swap(arr,0,4);
        ArrayTool.printarr(arr);
        ArrayTool.reserve(arr);
        ArrayTool.printarr(arr);*/
    }
}
