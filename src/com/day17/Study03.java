package com.day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Study03 {
    private ArrayList<String> arrayList;

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("cc");
        set.add("dd");
        set.add("cc");
        set.add("ss");
        set.add("xx");
        System.out.println(set);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        System.out.println(arrayList);
        show(arrayList);
        Person p = new Person();
        System.out.println(p.getClass().getPackage());
    }
    public static void show(Collection c) {
        System.out.println(c.getClass().getName());
    }
}
class Person {
    public static void show(Collection c) {
        System.out.println(c.getClass().getName());
    }
}