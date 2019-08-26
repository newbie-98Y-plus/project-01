package com.day27;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Test_打印字符流 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("qqq.txt"),true);
        pw.write(97);
        pw.print(97);
        pw.println(99);//自动刷新
    }
}
