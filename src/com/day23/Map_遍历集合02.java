package com.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_遍历集合02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("145",567);
        map.put("yyy",256);
        map.put("awsl",666);

        //map_键值对对象迭代器(map);
        map_键值对对象增强for(map);
    }

    private static void map_键值对对象增强for(Map<String, Integer> map) {
        for (Map.Entry<String,Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + "..." + en.getValue());
        }
    }

    private static void map_键值对对象迭代器(Map<String, Integer> map) {
        Set<Map.Entry<String,Integer>> entries = map.entrySet();//键值对对象Set集合
        Iterator<Map.Entry<String,Integer>> it = entries.iterator();//迭代器
        while (it.hasNext()) {
            Map.Entry<String,Integer> en = it.next();//键值对对象
            String key = en.getKey();//键
            int value = en.getValue();//值
            System.out.println(key + "..." + value);
        }
    }
}
