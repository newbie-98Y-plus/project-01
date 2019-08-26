package com.home06;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 8、用代码实现以下需求
 * 	(1)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
 * 	(2)打印格式：
 * 		to=3
 * 		think=1
 * 		you=2
 * 		//........
 * 	(3)按照上面的打印格式将内容写入到D:\\count.txt文件中(要求用高效流)
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.trim().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> en : entries) {
            System.out.println(en);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\count.txt"));

        for (Map.Entry<String, Integer> en : entries) {
            bw.write(String.valueOf(en));
            bw.newLine();
        }
        bw.close();


    }


}
