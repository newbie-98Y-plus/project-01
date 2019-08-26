package com.home01;

import java.util.Scanner;

public  class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sn = sc.next();
        System.out.println(Test02.getPropertyGetMethodName(sn));
        }

    public static String getPropertyGetMethodName(String property) {
        String s = new String(property);
        char c = s.charAt(0);
        String s1 = String.valueOf(c);
        s1 = s1.toUpperCase();
        s = s.substring(1);
        s = s1+s;
        return ("get" + s);
    }
}
