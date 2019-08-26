package com.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i]) + 1);
            }else
                map.put(c[i],1);
        }
        System.out.println(map);
    }
}
