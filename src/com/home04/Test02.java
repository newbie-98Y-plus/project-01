package com.home04;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//定义一个Set集合，存储String类型的数据，存入多个元素
 //       使用四种方式对Set集合进行遍历输出
public class Test02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set,
                "降龙十八掌",
                "六脉神剑",
                "葵花宝典",
                "九阴白骨爪"
                );
        //set_遍历一(set);
        //set_遍历二(set);
        //set_遍历三(set);
        set_遍历四(set);

    }

    private static void set_遍历四(Set<String> set) {
        String[] strs = set.toArray(new String[0]);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    private static void set_遍历三(Set<String> set) {
        Object[] objs = set.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
    }

    private static void set_遍历二(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void set_遍历一(Set<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }
}
