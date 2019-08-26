package com.day25;

import java.io.File;

public class File_子文件夹 {
    public static void main(String[] args) {
        getFile(new File("C:\\"));
    }
    public static void getFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f.getName() + ".........." + f.length());
                } else {
                    getFile(f);
                }
            }
        }
    }
}
