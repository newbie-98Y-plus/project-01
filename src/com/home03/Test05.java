package com.home03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

//比较Vector、ArrayList和LinkedList在头部增删元素的效率
public class Test05 {
    public static void main(String[] args) {
        vector_Test();
        arraylist_Test();
        linkedlist_Test();
    }

    private static void linkedlist_Test() {
        LinkedList ll = new LinkedList();
        long start1 = System.currentTimeMillis();
        for (int i = 0;i < 49999;i++) {
            ll.addFirst(i);
            ll.removeFirst();
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }

    private static void arraylist_Test() {
        ArrayList al = new ArrayList();
        long start1 = System.currentTimeMillis();
        for (int i = 0;i < 49999;i++) {
            al.add(0,i);
            al.remove(0);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }

    private static void vector_Test() {
        Vector ve = new Vector();
        long start1 = System.currentTimeMillis();
        for (int i = 0;i < 49999;i++) {
            ve.addElement(i);
            ve.removeElement("123");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}
