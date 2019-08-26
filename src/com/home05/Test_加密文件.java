package com.home05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_加密文件 {
    public static void main(String[] args) throws IOException {
        File  file = new File("E:/eee.txt");

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("E:/aaa.txt");

        int b;
        while ((b = fis.read()) != -1) {
            b = ~b;
            fos.write(b);//加密
        }
        fis.close();
        fos.close();


    }
}
