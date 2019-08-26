package com.day25;

import java.io.*;

public class Buffer_拷贝 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("源文件.wmv");
        FileOutputStream fos = new FileOutputStream("目标文件_copy.wmv");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        /*BufferedInputStream bis1 = new BufferedInputStream(bis);
        BufferedOutputStream bos1 = new BufferedOutputStream(bos);

        BufferedInputStream bis2 = new BufferedInputStream(bis1);
        BufferedOutputStream bos2 = new BufferedOutputStream(bos1);*/

        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
