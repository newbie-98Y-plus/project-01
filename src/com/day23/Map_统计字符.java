package com.day23;

import java.util.*;

public class Map_统计字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c1 : c) {
            /*if (map.containsKey(c1)) {
                map.put(c1,map.get(c1) + 1);
            }else
                map.put(c1,1);*/
            map.put(c1,map.containsKey(c1) ? map.get(c1) + 1 : 1);//三元表达式
        }
        System.out.println(map);
        System.out.println(getString(map));

    }
    public static String getString(Map<Character,Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> en : map.entrySet()) {
            sb.append(en.getKey()).append("有").append(en.getValue()).append("个,");
        }
        sb.replace(sb.length() - 1,sb.length(),"。");
        return sb.toString();
    }
}
