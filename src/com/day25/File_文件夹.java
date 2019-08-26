package com.day25;

import java.io.File;

public class File_文件夹 {
    public static void main(String[] args) {
        File file = new File("D:");
        File[] files = file.listFiles();
        for (File f : files
             ) {
            System.out.println(f.getAbsolutePath() + "..." + (f.isFile() ? "文件" : "文件夹"));
        }
    }
}
