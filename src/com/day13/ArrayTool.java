package com.day13;

/** 数组工具类
 * @author 自闭boy
 * @version v1.0
 */
public class ArrayTool {
    private ArrayTool(){

    }

    /**
     * 遍历数组
     * @param arr 数组名
     */
    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    /**
     * 数组最大值
     * @param arr 数组名
     * @return 最大值
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 交换指定索引值
     * @param arr 数组名
     * @param a 索引值
     * @param b 索引值
     */
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 数组反转
     * @param arr 数组名
     */
    public static void reserve(int[] arr){
        int i;
        int j ;
        for (i = 0,j = arr.length-1; i < j; i++,j--) {
            swap(arr,i,j);
        }
    }
}
