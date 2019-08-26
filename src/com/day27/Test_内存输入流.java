package com.day27;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test_内存输入流 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FileInputStream fis = new FileInputStream("x1.txt");
        byte[] bytes = new byte[3];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            baos.write(bytes,0,len);
        }
        fis.close();
        System.out.println(baos.toString());
        baos.close();

    }
}
