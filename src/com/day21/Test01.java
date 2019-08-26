package com.day21;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        //System.out.println(new String(c));
        //冒泡排序
        for(int i = 0;i < c.length - 1;i++) {
            for(int j = 0;j < c.length - i - 1 ;j++) {
                if(c[j] < c[j + 1]) {
                    char temp = c[j + 1];
                    c[j + 1] = c[j];
                    c[j] = temp;
                }
            }

    }
		System.out.println(new String(c));
    }

}
