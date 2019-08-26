package com.day19;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"10");
        map.put(2,"20");
        map.put(3,"30");
        map.put(4,"40");
        System.out.println(map);
        String str = map.remove(1);//删除key为1，返回value
        System.out.println(map);
        System.out.println(str);//value
        System.out.println(map.size());//键值对
        System.out.println(map.get(2));//key为2的value
        System.out.println(map.containsKey(3));//是否存在key为3
        System.out.println(map.containsValue("40"));//是否存在value为40
        map.put(4,"444");//替换
        System.out.println(map);
        map.clear();//清空
        System.out.println(map);


    }
}
