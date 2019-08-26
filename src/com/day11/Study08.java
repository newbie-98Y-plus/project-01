package com.day11;

import java.util.Scanner;

public class Study08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char c = str.charAt(0);
        String s1 = String.valueOf(c);
        s1 = s1.toUpperCase();
        str = str.substring(1);
        System.out.println(s1+str);
    }
}
