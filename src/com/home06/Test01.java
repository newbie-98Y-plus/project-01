package com.home06;

import java.io.File;
import java.util.Scanner;

/**
 * 1、键盘录入一个文件夹路径，删除该文件夹（包含文件夹内容）
 * //差点把盘符都删了，慎用
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        File file = new File(line);
        deleFile(file);
    }
    public static void deleFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    f.delete();
                }else {
                    deleFile(f);
                    f.delete();
                }
            }
        }
        file.delete();
    }
}
