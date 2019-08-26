package com.day21;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst("123");
        list.addFirst("456");
        list.addFirst("789");
        list.addLast("456");
        list.addLast("456");
        System.out.println(list);

    }
}
