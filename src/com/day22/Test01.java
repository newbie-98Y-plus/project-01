package com.day22;

import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        if (t.add("one")) ;

        if (t.add("two")) ;

        if (t.add("three")) ;

        t.add("four");
        for (String s : t) {
            System.out.print(s);
        }
    }
}
