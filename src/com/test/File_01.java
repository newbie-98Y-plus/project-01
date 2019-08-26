package com.test;

import java.io.File;
//练习-遍历文件夹
// * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
// * 遍历这个目录下所有的文件(不用遍历子目录)
// * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
// * 注: 最小的文件不能是0长度
public class File_01 {
    public static void main(String[] args) {
        File file = new File("C:/Windows");
        File[] files = file.listFiles();
        long fmax = 0;
        long fmin = Long.MAX_VALUE;
        String fmaxname = "";
        String fminname = "";
        for (File f : files) {
            if (f.isFile()) {
                if (fmax < f.length()) {
                    fmax = f.length();
                    fmaxname = f.getName();
                }
                if (fmin > f.length() && f.length() != 0) {
                    fmin = f.length();
                    fminname = f.getName();
                }
            }
        }
        System.out.println("最大文件：" + fmaxname + "\t字节数：" + fmax);
        System.out.println("最小文件：" + fminname + "\t字节数：" + fmin);


    }
}
