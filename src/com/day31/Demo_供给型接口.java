package com.day31;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Demo_供给型接口 {
    public static void main(String[] args) {
        List<Integer> list = creatNum(10, () -> new Random().nextInt(31) + 20);
        System.out.println(list);
    }
    //生产数据
    public static List<Integer> creatNum(int n, Supplier<Integer> sup) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int num = sup.get();
            list.add(num);
        }
        return list;
    }
}
