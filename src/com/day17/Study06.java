package com.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Study06 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String str = sc.nextLine();
        System.out.println(x);
        System.out.println(str);
    }

    private static void String01() {
        String str = "1234";
        int a = 34;
        String s1 = "12" + a;
        System.out.println(str.equals(s1));
    }

    private static void scanner01() throws FileNotFoundException {
        InputStream is = System.in;
        //System.out.println(is.read());
        /*Scanner sc = new Scanner(is);
        System.out.println(sc.nextInt());*/
        Scanner sc1 = new Scanner(new File("D:\\D盘文件\\Idea\\project-01\\untitled\\src\\com\\day17\\a.txt"));
        System.out.println(sc1);
        System.out.println(sc1.nextInt());
    }
}
