package com.day18;

public class String01 {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        String str3 = "ab";
        String str4 = str3 + "c";
        System.out.println(str4.equals(str));
        System.out.println(str4 == str);




    }
}
