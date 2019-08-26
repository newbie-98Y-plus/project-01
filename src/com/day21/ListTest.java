package com.day21;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(0,1);
        list1.add(1,2);
        list1.add(2,3);
        List list2 = new ArrayList();
        list2.add(0,22);
        list2.add(1,33);
        list2.add(2,44);
        change(list1,list2,0,2);
        System.out.println(list1);
        System.out.println(list2);

    }
    public static void change(List list1,List list2,int a,int b) {
        Object obj = list1.get(a);
        list1.set(a,list2.get(b));
        list2.set(b,obj);
    }
}
