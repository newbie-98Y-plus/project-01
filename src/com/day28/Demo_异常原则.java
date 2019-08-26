package com.day28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_异常原则 {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        //将编译时异常转换成运行时异常抛出
        try {
            FileInputStream fis = new FileInputStream("q_copy.txt");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
