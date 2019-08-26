package com.day18;

import java.util.Arrays;

public class String02 {
    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(c);//字符数组转字符串
        System.out.println(str);
        char[] c1 = str.toCharArray();//字符串转字符数组
        System.out.println(Arrays.toString(c1));
        String str1 = new String(c,1,2);//索引  个数
        System.out.println(str1);

    }


}
