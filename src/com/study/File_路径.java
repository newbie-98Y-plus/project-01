package com.study;

import sun.rmi.runtime.Log;

import java.io.File;
import java.io.IOException;

public class File_路径 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\z.txt");
        /*System.out.println(file);
        System.out.println(file.createNewFile());
        File file1 = new File("E:\\aa\\a\\b\\b.txt");
        System.out.println(file1.mkdirs());*/
        System.out.println(file.createNewFile());
        //System.out.println(file.delete());
        System.out.println(file.getAbsolutePath());

    }
}
