package com.day16;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {
    public static void main(String[] args) {
        //getArr();类型不匹配ClassCastException
        getGeneric();

    }
    public static void getGeneric() {
        ArrayList<String> als = new ArrayList<>();
        als.add("aaa");
        als.add("ccc");
        als.add("0.99");
        als.add("9");
        for (Iterator<String> iterator = als.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            System.out.println(next);
        }
    }


    public static void getArr() {
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add('c');
        al.add(0.99);
        al.add(9);
        for (int i = 0; i < al.size(); i++) {
            String s = (String) al.get(i);
            System.out.println(s);
        }
    }
}
