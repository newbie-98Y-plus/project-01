package com.day18;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//创建一个长度是100的字符串数组
//使用长度是2的随机字符填充该字符串数组
//统计这个字符串数组里重复的字符串有多少种
public class String17 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String[] str = new String[100];
        //Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(RandomStringUtils.randomAlphanumeric(2)).append(" ");
        }
        Map<String,Integer> map = new HashMap<>();
        String[] strs = sb.toString().split(" ");
        int count = 0;
        for (String s : strs) {
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else {
                map.put(s, 1);
            }
            if(map.get(s) > 1) {
                count++;
            }
        }
        System.out.println(map);
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");


        /*System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.toString());*/
    }
}
