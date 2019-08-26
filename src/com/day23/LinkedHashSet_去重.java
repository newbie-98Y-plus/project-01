package com.day23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
//使用LinkedHashSet去除list中相同的元素并保持剩余顺序不变
public class LinkedHashSet_去重 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(123);
        list.add(456);
        list.add(123);
        list.add(789);
        list.add(888);
        list.add(888);
        list.add(356);
        LinkedHashSet_Test(list);


    }

    private static void LinkedHashSet_Test(List<Integer> list) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.addAll(list);
        list.clear();
        list.addAll(lhs);
        System.out.println(list);
    }
}
