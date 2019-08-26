package com.day26;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test_文件反转 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\D盘文件\\Idea\\project-01\\untitled\\src\\a.java"));
        ArrayList<String> al = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            al.add(str);
        }
        br.close();

        Collections.reverse(al);

        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.java"));
        for (String s : al
             ) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
    }
}
