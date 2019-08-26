package com.day25;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputSteam_read {
    public static void main(String[] args) throws IOException {
        File file = new File("untitled/File/a.txt");
        System.out.println(file.length());
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);//读取的字节数
        System.out.println(Arrays.toString(bytes) + "----" + new String(bytes,0,len) + "..." + len);
        len = fis.read(bytes);//读取的字节数
        System.out.println(Arrays.toString(bytes) + "----" + new String(bytes,0,len) + "..." + len);


        fis.close();


    }

    private static void read(FileInputStream fis) throws IOException {
        int i ;
        while ((i = fis.read())!= -1) {
            System.out.println((char) i);
        }
    }
}
