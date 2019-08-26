package com.day24;

import java.io.File;

public class File_路径 {
    public static void main(String[] args) {
        File file = new File("E:\\aaaa");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getPath());

        File file1 = new File(file,"bbb");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
    }
}
