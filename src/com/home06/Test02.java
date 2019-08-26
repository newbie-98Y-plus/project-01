package com.home06;

import java.io.File;
import java.util.Scanner;

/**
 * 键盘录入一个文件夹路径，统计该文件夹的大小
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        File file = new File(line);
        System.out.println("该文件夹的大小为：" + getLen(file));

    }
    public static long getLen(File file) {
        long len = 0;
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                     len += f.length();
                }else {
                     len += getLen(f);
                }
            }
        }
        return len;
    }

}
