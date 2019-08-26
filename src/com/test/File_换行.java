package com.test;

import java.io.*;

public class File_换行 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\test.txt"),"gbk"));
        String len;
        String[] str;
        StringBuilder sb = new StringBuilder();

        while ((len = br.readLine()) != null) {
            System.out.println(len);
            str = len.split(",");
            for (String s : str) {
               // System.out.println(s);
                sb.append(s).append(",\r\n");
            }
        }
        br.close();
        System.out.println(sb.toString());
    }
}
