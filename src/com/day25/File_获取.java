package com.day25;

import java.io.File;
import java.io.IOException;

public class File_获取 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/a/b");
        File f = new File(f1,"HelloWorld.txt");
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());

        File f3 = new File("day25/a/b");
        File f4 = new File(f3,"f.txt");
        f4.createNewFile();

    }
}
