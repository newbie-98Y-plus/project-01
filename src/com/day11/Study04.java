package com.day11;

public class Study04 {
    public static void main(String[] args) {
        String s1 = "3333";
        String s2 = "";
        String str = new String();
        String s3 = new String(str);
        System.out.println(str == s2);
        System.out.println(str.equals(s2));
    }
}
