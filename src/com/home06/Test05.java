package com.home06;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        File file = new File("E:\\day20\\笔记");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
    }
}
