package com.day22;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_增强for循环 {
    public static void main(String[] args) {
        Set<Person> pers = new HashSet<>();
        Collections.addAll(pers,
                new Person("lisi",17),
                new Person("liufei",18),
                new Person("boluo",18),
                new Person("yuanmiao",20)
                );
        for (Person p : pers) {
            System.out.println(p);
            p.setAge(25);
        }
        System.out.println("_______________________");
        System.out.println(pers);
    }
}
