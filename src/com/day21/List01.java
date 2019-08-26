package com.day21;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0,1111);//0--1--2--3--4
        list.add(0,2222);//   0--0--0--1
        list.add(1,3333);//      1--2--3
        list.add(1,4444);//         1--2
        list.add(0,5555);//            0
        list.remove(1);
        System.out.println(list);
        list.set(0,6666);
        System.out.println(list.get(0));
    }
}
