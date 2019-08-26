package com.day18;

public class String11 {
    public static void main(String[] args) {
        System.out.println(stringRev("abc"));
    }

    private static String stringRev(String str) {
        return new StringBuilder(str).reverse().toString();//字符反转
    }
}
