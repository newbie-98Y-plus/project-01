package com.day18;

public class String05 {
    public static void main(String[] args) {
        String str = "abcdefcdef";
        int i = str.indexOf(99);
        int i1 = str.indexOf('c');
        System.out.println(i);
        System.out.println(str.charAt(3));
        System.out.println(str.substring(1));
        System.out.println(str.substring(1,3));
        System.out.println(str.indexOf("cd"));
        System.out.println(str.indexOf("cd",4));
        System.out.println(str.lastIndexOf("ef"));
        System.out.println(str.lastIndexOf("ef",7));
        String str1 = "hello world";
        System.out.println(str1.toUpperCase());
        System.out.println(String.valueOf(new Object()));
    }
}
