package com.day23;

import java.util.LinkedHashSet;

public class LinkedHashSet_Test01 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(123);
        lhs.add(321);
        lhs.add(456);
        lhs.add(490);
        lhs.add(456);
        System.out.println(lhs);
    }
}
