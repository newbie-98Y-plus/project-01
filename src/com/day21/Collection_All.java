package com.day21;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_All {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("abc");
        c1.add("xyz");
        c1.add(123);

        Collection c2 = new ArrayList();
        c2.add("qq");
        c2.add(123);
        c2.add(666);


        c1.removeAll(c2);
        System.out.println(c1);
        System.out.println(c1.containsAll(c2));
        c1.retainAll(c2);
        System.out.println(c1);
        c1.addAll(c2);
        System.out.println(c1);

    }
}
