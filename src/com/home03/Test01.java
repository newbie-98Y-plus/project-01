package com.home03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//定义方法统计集合中指定元素出现的次数，如"a" 3,"b" 2,"c" 1
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");

        System.out.println(frequency(list, "a"));	// 3
        System.out.println(frequency(list, "b"));	// 2
        System.out.println(frequency(list, "c"));	// 1
        System.out.println(frequency(list, "d"));	// 5
        System.out.println(frequency(list, "xxx"));	// 0
    }
    public static int frequency(List<String> list,String str) {
        int count = 0;
        ListIterator li = list.listIterator();
        for(;li.hasNext();) {
            if(li.next() == str) {
                count++;
            }
        }
        return count;
    }
}
