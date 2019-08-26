package com.day12;

import java.util.Scanner;

public class Study02 {
    public static void main(String[] args) {

        cherk("03325324342");

    }
    public static void cherk(String str){
        String reg = "[1-9][0-9]{4,14}";
        System.out.println((str.matches(reg))?"合法":"不合法");
    }
}
