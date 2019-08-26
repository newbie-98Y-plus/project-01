package com.home01;

import java.util.Scanner;

//定义一个方法，功能如下：给定一个字符串，返回该字符串的反转形式
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //StringRev(str);
        str = BuilderRev(str);
        System.out.println(str);


    }
    private static String BuilderRev(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static void StringRev(String str) {
        char[] c = str.toCharArray();
        char c1;
        for(int i = 0;i<c.length/2;i++){
            c1 = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = c1;
        }
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]);
        }
    }
}
