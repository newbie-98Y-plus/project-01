package com.home03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//(1)定义List集合，存入多个字符串
//	(2)删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
//	(3)然后利用迭代器遍历集合元素并输出
public class Test04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < 5;i++) {
            String str = sc.nextLine();
            list.add(str);
        }
        System.out.println(list.size());
        ListIterator li = list.listIterator();
        while (li.hasNext()) {
            Object obj = li.next();
            String strs = (String)obj;
            if (strs.matches(".*\\d+.*")) {
                li.remove();
            }
        }
        System.out.println(list);

    }
}
