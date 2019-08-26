package com.day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test_键盘输入包装 {
    public static void main(String[] args) throws IOException {
        test_高效缓冲字符流();

    }

    private static void test_高效缓冲字符流() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
    }

    private static void test_02单个字符输入() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        int c = isr.read();
        System.out.println((char)c);
    }

    private static void test_01单个字节输入() throws IOException {
        InputStream is = System.in;
        int c = is.read();
        System.out.println((char)c);
    }
}
