package com.home03;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

//比较Vector、ArrayList和LinkedList根据索引查询元素的效率
public class Test06 {
    public static void main(String[] args) {
        linkedlist_serch();
        arraylist_serch();
        vector_serch();
    }

    private static void linkedlist_serch() {
        LinkedList ll = new LinkedList();
        for (int i = 0;i < 49999;i++){
            ll.addFirst(RandomStringUtils.randomAlphanumeric(3));
        }
        long start = System.currentTimeMillis();
        for (int j = 0;j < ll.size();j++) {
            if (ll.get(j) == "123") {
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void arraylist_serch() {
        ArrayList al = new ArrayList();
        for (int i = 0;i < 49999;i++){
            al.add(RandomStringUtils.randomAlphanumeric(3));
        }
        long start = System.currentTimeMillis();
        for (int j = 0;j <al.size();j++) {
            if (al.get(j) == "123") {
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void vector_serch() {
        Vector ve = new Vector();
        for (int i = 0;i < 49999;i++){
        ve.addElement(RandomStringUtils.randomAlphanumeric(3));
        }
        long start = System.currentTimeMillis();
        for (int j = 0;j < ve.size();j++) {
            if (ve.get(j) == "123") {
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
