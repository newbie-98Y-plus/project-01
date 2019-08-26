package com.day22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//把List<String>集合中的重复元素去除（不可用循环）
public class Set_去除List重复的元素 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("f");
        list.add("a");
        list.add("c");
        list.add("a");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);

    }
}
