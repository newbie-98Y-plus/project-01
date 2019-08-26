package com.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_双列集合 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("145",567);
        map.put("yyy",256);
        map.put("awsl",666);
        map.put("",0);
        map.put(null,null);
        System.out.println(map);
        map.put("hello",01);
        map.remove("145");
        System.out.println(map);
        map.put("awsl",1111);
        System.out.println(map.get(""));
        System.out.println(map.containsKey("yyy"));
        System.out.println(map);

        Set<String> set = map.keySet();
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String str =  iterator.next();
            Integer in = map.get(str);
            System.out.println(str + "..." + in);
        }
        System.out.println(map);




    }
}
