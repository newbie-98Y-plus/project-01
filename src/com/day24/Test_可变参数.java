package com.day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_可变参数 {
    public static void main(String[] args) {
        int count = getSum("1",2,3,4,5,6,7,8,9,0);
        System.out.println(count);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,123,2345,678);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);


    }
    public static int getSum(String str,int...arr) {
        int sum = 0;
        for (int i : arr
             ) {
            sum = i + sum;
        }
        return sum;
    }
}
