package com.home05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//(1)利用键盘录入，输入一个字符串
//	(2)统计该字符串中各个字符的数量
//	(3)如：
//		用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-ujiuye-to-learn-java"
//		程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1).....
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] crr = line.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for (char c : crr) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c) + 1);
            }else
                map.put(c,1);

        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            sb.append(en.getKey()).append("("+ en.getValue() +")");
        }
        System.out.println(sb.toString());

    }

}
