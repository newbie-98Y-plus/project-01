package com.test;

import java.io.File;

public class File_03 {
    public static void main(String[] args) {
        File file = new File("E:/a.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }
}
