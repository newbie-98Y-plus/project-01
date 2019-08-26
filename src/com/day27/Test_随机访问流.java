package com.day27;


import java.io.IOException;
import java.io.RandomAccessFile;

public class Test_随机访问流 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("rrr.txt","rw");
        raf.seek(45);
        raf.write(104);
        raf.seek(10);
        System.out.println(raf.read());
        raf.close();


    }
}
