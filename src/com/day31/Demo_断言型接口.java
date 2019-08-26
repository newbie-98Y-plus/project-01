package com.day31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Demo_断言型接口 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"1234","5678","678","34");
        List<String> result1 = filt(list, x -> x.length() == 3, x -> x.matches(".*\\d"));
        System.out.println(result1);
        List<String> result2 = filt(list, x -> x.contains("678"), x -> x.length() == 4);
        System.out.println(result2);

    }
    //negate()条件取反,and(条件)与,or(条件)或
    public static List<String> filt(List<String> list, Predicate<String> pre, Predicate<String> pre2) {
        ArrayList<String> al = new ArrayList<>();
        for (String s : list) {
            if (pre.negate().and(pre2).test(s)) {
                al.add(s);
            }
        }
        return al;
    }
}
