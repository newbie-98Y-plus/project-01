package com.day25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class InOutSteam_拷贝 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("源文件.wmv");//创建输入流对象，关联源文件
        FileOutputStream fos = new FileOutputStream("目标文件_copy.wmv");//创建输出流对象，关联目标文件
        test_小数组拷贝(fis, fos);
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void test_小数组拷贝(FileInputStream fis, FileOutputStream fos) throws IOException {
        byte[] bytes = new byte[1024 * 8];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
    }

    private static void test_整个文件拷贝(FileInputStream fis, FileOutputStream fos) throws IOException {
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
        fos.write(bytes);
    }

    private static void test_单个字节拷贝(FileInputStream fis, FileOutputStream fos) throws IOException {
        int b;
        while ((b = fis.read()) != -1) {//读取单个字节
            fos.write(b);//写出单个字节
        }
    }
}
