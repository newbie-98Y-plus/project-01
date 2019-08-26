package com.day28;
/**
 * //设计一个方法，用于移除Java文件中的注释
 */

import java.io.*;
import java.util.Scanner;


public class Demo_移除注释 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        FileReader fr = new FileReader(str);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String len;
        while((len = br.readLine()) != null) {
            //如果不包含"//","/**/",添加到字符串容器sb中
            if (!(len.trim().contains("//") || len.trim().contains("/**") || len.trim().contains("*/") || len.trim().indexOf("*") == 0)) {
                sb.append(len).append("\r\n");
            }
        }
        br.close();
        //创建高效缓冲字符流bw,清空文件
        BufferedWriter bw = new BufferedWriter(new FileWriter(str));
        //将sb转换成字符串写入文件中
        bw.write(sb.toString());
        bw.close();

    }
}
