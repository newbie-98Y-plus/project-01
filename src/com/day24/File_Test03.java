package com.day24;

import java.io.File;
import java.util.Scanner;

public class File_Test03 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入一个文件夹路径");
            String line = sc.nextLine();
            File file = new File(line);
            while (!file.isDirectory()) {
                System.out.println("请重新录入");
                file = new File(sc.nextLine());
            }
            recursion(file);

    }
    public static void recursion(File file) {
            if (file.isFile()) {
                System.out.println("文件的绝对路径" + file.getAbsolutePath());
            } else
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    recursion(file);
                }
            }
    }

}


