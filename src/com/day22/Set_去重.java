package com.day22;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_去重 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chs = str.toCharArray();
        Set<Character> set = new HashSet<>();
        //set_增强for遍历(chs, set);
        for (int i = 0; i < chs.length; i++) {
            set.add(chs[i]);
        }
        System.out.println(set);

    }

    private static void set_增强for遍历(char[] chs, Set<Character> set) {
        for (char c : chs) {
            set.add(c);
        }
        for (char c : set) {
            System.out.println(c);
        }
        System.out.println(set);
    }
}
