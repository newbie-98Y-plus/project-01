package com.home06;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//获取一个文本上每个字符出现的次数,将结果写在times.txt上
public class Test06 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        File file = new File(line);
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter("times.txt");
        Map<Character,Integer> map = new HashMap<>();
        Set<Map.Entry<Character,Integer>> set = map.entrySet();

        int len;
        while ((len = fr.read()) != -1) {
            char l = (char)len;
            map.put(l,map.containsKey(l) ? map.get(l) + 1 : 1);
        }
        fw.write(String.valueOf(set));
        System.out.println(set);
        System.out.println(map);
        fr.close();
        fw.close();



    }
}
