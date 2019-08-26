package com.home04;

import java.util.*;

//在数组中存储一些字符串，使用Arrays工具类，对数组中的元素进行排序，排序规则：
//按照字符串的长度降序排序，长度相同的，按照字典序的升序排序
public class Test04 {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        Collections.addAll(set,
                "abcd",
                "decfyu",
                "yslegz",
                "awsl",
                "nsmff",
                "abc"
                );*/
        String[] str = { "abcd", "decfyu", "yslegz", "awsl", "nsmff", "abc"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length = o2.length() - o1.length();
                if (length != 0) {
                    return length;
                }else
                    return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(str));
    }
}
