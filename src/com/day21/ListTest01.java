package com.day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        //listFor(list1);
        ListIterator li = list1.listIterator();
        li.add("x");
        li.add("y");
        System.out.println(list1);
        /*for (; li.hasPrevious(); ) {
            Object previous = li.previous();
            if(previous.equals("a")){
                li.add("666");
            }
            System.out.println(previous);
        }
        System.out.println(list1);*/
    }

    private static void listFor(List list1) {
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).equals(1))
            list1.add("java");
            System.out.println(list1.get(i));
        }
    }
}
