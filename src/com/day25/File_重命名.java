package com.day25;

import java.io.File;
import java.io.IOException;

public class File_重命名 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/a/b/c/d");
        boolean b = file.mkdirs();
        System.out.println(b);
        file = new File(file,"HelloWorld.txt");
        file.createNewFile();
        File f = new File("D:/a/b/c/d/HelloWorld.txt");
        System.out.println(f.exists());
        File fn = new File ("D:/a/b/HelloWorld.txt");
        f.renameTo(fn);
        System.out.println(fn.exists());
        System.out.println(fn.isFile());
        File f2 = new File("Z:");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isHidden());
    }
}
