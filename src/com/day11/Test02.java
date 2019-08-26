package com.day11;

public class Test02 {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("sdsaghh");
//        str = str.reverse();
//        System.out.println(str);
        StringBuilder str1 = new StringBuilder();
        int [] arr = {1,2,3};
        for(int i = 0;i< arr.length;i++){
            str1 = str1.append(arr[i]);
        }
        System.out.println(str1);
    }
}
