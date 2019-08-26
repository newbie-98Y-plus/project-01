package com.day18;

public class String10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcdef");
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.replace(1,3,"xy");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
