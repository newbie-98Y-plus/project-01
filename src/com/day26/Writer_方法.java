package com.day26;

import java.io.FileWriter;
import java.io.IOException;

public class Writer_方法 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:/www.txt");
        fw.write("Hello World");
        fw.close();
    }
}
