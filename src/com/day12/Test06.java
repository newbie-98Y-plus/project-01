package com.day12;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test05 t = new Test05();
        String name = sc.next();
        t.login(name);
    }
}
