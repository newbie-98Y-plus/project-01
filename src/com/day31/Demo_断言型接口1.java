package com.day31;

import java.util.function.Predicate;

public class Demo_断言型接口1 {
    public static void main(String[] args) {
        String str = "wewewq5sasSSS";
        boolean num = isNum(str, x -> str.matches(".*\\d.*"));
        System.out.println(num);

    }
    public static boolean isNum(String str, Predicate<String> pre) {
        boolean test = pre.test(str);
        return test;

    }
}
