package com.home06;

import java.io.File;
import java.util.*;

/**
 * 键盘录入一个文件夹路径，统计该文件夹下的各种后缀名的文件的个数
 * 	例如：.txt有10个，.java有30个......
 */


/**
 *            BUG
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        File file = new File(line);
        HashMap<String,Integer> map = new HashMap<>();
        getsuffix(file,map);


    }
    public static void getsuffix(File file,HashMap<String,Integer> map) {
        File[] files = file.listFiles();
        //Set<Map.Entry<String, Integer>> set = map.entrySet();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    int index = f.getName().lastIndexOf(".");
                    String str = f.getName().substring(index);
                    map.put(str,map.containsKey(str) ? map.get(str) + 1 : 1);
                }else {
                    getsuffix(f,map);
                }
            }
        }
    }
}
