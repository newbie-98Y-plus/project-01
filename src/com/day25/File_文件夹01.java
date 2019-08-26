package com.day25;

import java.io.File;
import java.util.Scanner;

public class File_文件夹01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            File file = new File(line);
            if (!file.isDirectory()) {
                System.out.println("请重新录入");
            }else {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        if (f.isFile() && f.length() > 20 * 1024 * 1024 && f.getName().endsWith(".wmv")) {
                            System.out.println(f.getName());
                        }
                    }
                }
            }
        }

    }
}
