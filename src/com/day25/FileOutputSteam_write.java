package com.day25;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteam_write {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("x.txt");//自动创建文件
        fos.write(87);
        fos.write(77);
        fos.write(67);
        byte[] arr = {101,102,103};
        fos.write(arr,0,3);
        fos.close();

    }
}
