package com.home03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
//	(2)编写方法对List集合进行排序
//	(2)然后利用迭代器遍历集合元素并输出
//	(3)如：15 18 20 40 46 60 65 70 75 91
public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 99) + 1);
        }
        sort_排序(list);
        ListIterator li = list.listIterator();
        for (;li.hasNext();) {
            Object objs = li.next();
            System.out.print(objs + " ");
        }


    }

    private static void sort_排序(List<Integer> list) {
        for (int x = 0;x < list.size() - 1;x++) {
            for (int y = 0;y < list.size() - x -1;y++) {
                if (list.get(y) > list.get(y + 1)) {
                    int temp = list.get(y + 1);
                    list.set(y + 1,list.get(y)) ;
                    list.set(y,temp);
                }
            }
        }
        System.out.println(list);
    }
}
