package com.day24;

import java.io.File;
import java.util.Scanner;

public class File_Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        File file = new File(line);
        isDir(sc, file);
    }

    private static void isDir(Scanner sc, File file) {
        while (!file.isDirectory()){
            System.out.println("没有此文件夹，请重新输入");
            file = new File(sc.nextLine());
        }
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.length() > 20 * 1024 * 1024) {
                    if (f.getAbsolutePath().endsWith(".wmv")) {
                        System.out.println(f.getAbsolutePath());
                    }
                }
            }
        }
    }
}


