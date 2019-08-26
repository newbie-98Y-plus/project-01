package com.study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//、在一个列表中存储以下元素：apple,grape,banana,pear
//    • 3.1 返回集合中的最大的和最小的元素 (比较长短)
//    • 3.2 将集合进行排序，并将排序后的结果打印在控制台上
public class Test_集合01 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addLast("apple");
        ll.addLast("grape");
        ll.addLast("banana");
        ll.addLast("pear");
        Collections.sort(ll);//按字符排序
        System.out.println(ll);
        Collections.sort(ll, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();//按字符长短排序
            }
        });
        System.out.println(ll);
        System.out.println("最短：" + ll.get(0));
        System.out.println("最长：" + ll.get(ll.size() - 1));

    }
}
