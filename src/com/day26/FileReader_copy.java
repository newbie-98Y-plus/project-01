package com.day26;

import java.io.*;

public class FileReader_copy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileReader fr = new FileReader("E:/www.txt");
        FileWriter fw = new FileWriter("E:/www_copy.txt");

        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        int len;
        while ((len = br.read()) != -1) {
            bw.write(len);
        }


        br.close();
        bw.close();
        long end = System.currentTimeMillis();

        System.out.println(end - start);


    }

    private static void test_字符小数组拷贝(FileReader fr, FileWriter fw) throws IOException {
        char[] arr = new char[1024 * 8];
        int len;
        while ((len = fr.read(arr)) != -1) {
            fw.write(arr,0,len);
        }
    }

    private static void test_字符拷贝(FileReader fr, FileWriter fw) throws IOException {
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(len);
        }
    }
}
