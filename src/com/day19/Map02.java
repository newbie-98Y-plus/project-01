package com.day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"h");
        map.put(2,"e");
        map.put(3,"l");
        map.put(4,"l");
        map.put(5,"o");
        map.put(6,"w");
        map.put(7,"o");
        map.put(8,"r");
        map.put(9,"l");
        map.put(10,"d");

        traverse02(map);
    }

    private static void traverse02(Map<Integer, String> map) {
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Iterator<Map.Entry<Integer, String>> iterator = set.iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, String> next =  iterator.next();
            System.out.print(next.getValue());
        }
    }

    private static void traverse01(Map<Integer, String> map) {
        Set<Integer> set = map.keySet();
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
            System.out.print(map.get(next));
        }
        System.out.println();
        for (Integer integer : set) {
            System.out.print(map.get(integer));
        }
    }
}
