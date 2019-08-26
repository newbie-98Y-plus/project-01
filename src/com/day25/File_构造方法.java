package com.day25;

import java.io.File;
import java.io.IOException;
//在D盘下的a/b/c/d中创建一个文件，名称HelloWorld.txt
public class File_构造方法 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/a/b/c/d");
        boolean b = file.mkdirs();
        System.out.println(b);
        file = new File(file,"HelloWorld.txt");
        boolean b1 = file.createNewFile();
        System.out.println(b1);
        file.delete();
        File f1 = new File("a");
        f1.createNewFile();
        f1.delete();



    }
}
