package com.test;

import java.io.File;
import java.util.Scanner;

//遍历子文件夹
public class File_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹:");
        String str = sc.nextLine();
        File file = new File(str);
        if (file.exists()){
            isDo(file);
        }

    }
    private static void isDo(File file) {
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        for (File f : files) {
                if (f.isDirectory() && files != null) {
                    isDo(f);
                }
                if (f.isFile()) {
                    System.out.println(f.getAbsolutePath());
                }

        }
    }
}
