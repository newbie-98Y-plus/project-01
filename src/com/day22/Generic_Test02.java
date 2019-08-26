package com.day22;

import java.util.Arrays;

public class Generic_Test02 {
    public static void main(String[] args) {
        Integer[] ints = {123,456,789};
        //swap(ints,0,2);
        System.out.println(Arrays.toString(ints));
        reverse(ints);
        System.out.println(Arrays.toString(ints));
    }
    //定义一个方法，可以交换任意类型的数组的某两个元素
    public static <T>  void swap(T[] trr,int a,int b) {
        T temp = trr[a];
        trr[a] = trr[b];
        trr[b] = temp;
    }
    //定义一个方法，字符反转
    public static <E> void reverse(E[] trr) {
        for (int i = 0,j = trr.length - 1; i < j; i++,j--) {
            swap(trr,i,j);
        }
    }
}
