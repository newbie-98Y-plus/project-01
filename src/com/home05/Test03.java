package com.home05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//(1)统计每个单词出现的次数
//	(2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
//	(3)打印格式：
//		    to=3
//  		think=1
//  		you=2
//  		........
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.trim().split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s : str) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> en : entries) {
            System.out.println(en);
        }
    }
}
