package com.day26;

import java.io.FileReader;
import java.io.IOException;

public class Reader_方法 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:/bbbb.txt");

        int len;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }

        fr.close();
    }
}
