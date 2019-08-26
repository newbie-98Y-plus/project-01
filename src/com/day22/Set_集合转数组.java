package com.day22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_集合转数组 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("橘猫");
        set.add("英短蓝猫");
        set.add("布偶猫");
        set.add("银渐层");

        set_数组小于集合大小(set);
        set_数组等于集合大小(set);
        set_数组大于集合大小(set, 10);

    }

    private static void set_数组大于集合大小(Set<String> set, int i) {
        String[] str = new String[i];
        String[] reslut = set.toArray(str);
        System.out.println(str + "---" + str.length + Arrays.toString(str));
        System.out.println(reslut + "---" + reslut.length + Arrays.toString(reslut));
    }

    private static void set_数组等于集合大小(Set<String> set) {
        String[] str = new String[set.size()];
        String[] reslut = set.toArray(str);
        System.out.println(str + "---" + str.length + Arrays.toString(str));
        System.out.println(reslut + "---" + reslut.length + Arrays.toString(reslut));
    }

    private static void set_数组小于集合大小(Set<String> set) {
        String[] str = new String[3];
        String[] reslut = set.toArray(str);
        System.out.println(str + "---" + str.length + Arrays.toString(str));
        System.out.println(reslut + "---" + reslut.length + Arrays.toString(reslut));
    }
}
