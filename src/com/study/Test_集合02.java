package com.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来
public class Test_集合02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        System.out.println(strs.length);
        ArrayList<String> al = new ArrayList<>();
        for (String s : strs) {
            al.add(s);
        }
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(al);
    }
}
