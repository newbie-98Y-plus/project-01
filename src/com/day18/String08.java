package com.day18;

public class String08 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb = sb.append("cde");
        sb.insert(3,false);
        System.out.println(sb);

        sb.insert(0,"25.00");
        System.out.println(sb);

        sb.insert(1,true);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());


    }
}
