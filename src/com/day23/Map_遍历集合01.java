package com.day23;

import java.util.*;

public class Map_遍历集合01 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("145",567);
        map.put("yyy",256);
        map.put("awsl",666);

        //map_根据键获取值迭代器(map);

        map_根据键获取值增强for(map);

    }

    private static void map_根据键获取值增强for(Map<String, Integer> map) {
        for (String key : map.keySet()) {
           System.out.println(key + "..." + map.get(key));
       }
    }

    private static void map_根据键获取值迭代器(Map<String, Integer> map) {
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            int value = map.get(key);
            System.out.println(key + "..." + value);
        }
    }
}
