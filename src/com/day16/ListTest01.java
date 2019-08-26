package com.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest01 {
    public static void main(String[] args) {
        list_迭代器遍历();//元素添加节点之和
        list_循环遍历1();//元素添加集合最后
        list_循环遍历2();//数组长度不可变


    }
    public static void list_迭代器遍历() {
        List ls = new ArrayList();
        ls.add("hello");
        ls.add("wetrr");
        ls.add("Int");
        ls.add("error");
        ListIterator it = ls.listIterator();
        while (it.hasNext()){
            Object ot = it.next();
            if("hello".equals(ot)){
                it.add("world");
            }
        }
        System.out.println(ls);
    }
    public static void list_循环遍历1() {
        List ls = new ArrayList();
        ls.add("hello");
        ls.add("wetrr");
        ls.add("Int");
        ls.add("error");
        for (int i = 0; i < ls.size() ; i++) {
            Object obj = ls.get(i);
            if("hello".equals(obj)){
                ls.add("world");
            }
        }
        System.out.println(ls);
    }
    public static void list_循环遍历2() {
        List ls = new ArrayList();
        ls.add("hello");
        ls.add("wetrr");
        ls.add("Int");
        ls.add("error");
        Object[] obj = ls.toArray();
        for (int i = 0; i < obj.length; i++) {
            obj[i] = ls.get(i);
            if("hello".equals(obj)){
                ls.add("world");
            }
        }
        System.out.println(ls);
    }


}
