package com.day22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Set_集合 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //生成十个1-100不同的数字
        Random rd = new Random();
        while (set.size() < 10) {
            set.add(rd.nextInt(100) + 1);
        }
        System.out.println(set);
    }
}
