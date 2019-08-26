package com.home06;

import java.io.*;
import java.util.*;

/**
 * 产生10个1-100的随机数，并放到一个数组中
 * 	(1)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 * 	(2)把数组中的数字放到当前文件夹的number.txt文件中
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 100);
            set.add(a);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(set);
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            if ((int)(lit.next()) < 10) {
                lit.remove();
            }
        }
        System.out.println(list);


        BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));

        for (int i : list
             ) {
            bw.write(i);
            bw.write(",");
            bw.newLine();
            System.out.println(i);
        }
        bw.close();

    }
}
