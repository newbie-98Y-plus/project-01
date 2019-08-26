package com.home03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//(1)定义List集合，存入多个字符串，其中包含三个连续的"def"
//	(2)删除集合中字符串"def"
//	(3)然后利用迭代器遍历集合元素并输出
public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("def");
        list.add("123");
        list.add("dof");
        list.add("afc");

    }

    private static void list_removeAll(List<String> list) {
        List<String> list1 = new ArrayList<>();
        list1.add("def");
        list.removeAll(list1);
        System.out.println(list);
    }


    private static void list_remove(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("def")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }


    private static void ListIterator_remove(List<String> list) {
        ListIterator li = list.listIterator();
        for (;li.hasNext();) {
            if (li.next().equals("def")) {
                li.remove();
            }
        }
        System.out.println(list);
    }
}
