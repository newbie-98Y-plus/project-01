package com.study;

import java.util.Scanner;

//实现一个输入输入字符串，并逆序输出的代码，要求手写
public class Test02_字符串逆序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());

    }
}
