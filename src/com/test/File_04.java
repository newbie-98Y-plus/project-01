package com.test;

import java.io.File;

public class File_04 {
    public static void main(String[] args) {
        File file = new File("Z:");
        System.out.println(file.isHidden());//隐藏文件
    }
}
