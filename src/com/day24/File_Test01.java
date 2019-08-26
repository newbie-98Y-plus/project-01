package com.day24;

import java.io.File;
import java.util.ArrayList;

/**
 * 练习-遍历文件夹
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
 * 遍历这个目录下所有的文件(不用遍历子目录)
 * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 * 注: 最小的文件不能是0长度
 */

public class File_Test01 {
    public static void main(String[] args) {
        File file = new File("C:\\WINDOWS");
        File[] files = file.listFiles();
        ArrayList<File> al = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            File file1 = files[i];
            if (file1.isFile()) {
                al.add(file1);
                System.out.println(file1);
            }
        }
        long max = 0;
        long min = Long.MAX_VALUE;
        String maxname = "";
        String minname = "";
        for (File f : al) {
            if(max < f.length()) {
              max = f.length();
              maxname = f.getName();
            }
            if(f.length() != 0 && min > f.length()) {
                min = f.length();
                minname = f.getName();
            }
        }
        System.out.println("最大文件" + maxname + "字节个数" + max);
        System.out.println("最小文件" + minname + "字节个数" + min);




    }
}
