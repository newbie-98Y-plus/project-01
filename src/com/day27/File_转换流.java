package com.day27;

import java.io.*;

public class File_转换流 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("y1.txt"),"gbk");//以gbk的编码读取字节
        FileWriter fw = new FileWriter("x1.txt");//以默认的utf-8编码写入字符
        int c;
        while ((c = isr.read()) != -1) {
            fw.write(c);
        }
        isr.close();
        fw.close();
        //test_字符流到字节流();

    }

    private static void test_字符流到字节流() throws IOException {

        FileReader fr = new FileReader("x.txt");//以默认的编码读取字符
        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("y.txt"),"utf-8");//以utf-8的编码写入字节
        int c;
        while ((c = fr.read()) != -1) {
            osr.write(c);
        }
        fr.close();
        osr.close();
    }
}
