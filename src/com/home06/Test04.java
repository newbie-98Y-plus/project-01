package com.home06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 键盘录入一个文件夹路径，作为源文件夹；键盘录入一个文件夹路径，作为目标文件夹
 * 	写代码将源文件夹拷贝到目标文件夹中
 */
//C:\Program Files\feiq\Recv Files\day20
public class Test04 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        File file1 = new File(line1);
        File file2 = new File(line2);
        copyfileTo(file1,file2);


    }
    public static void copyfileTo(File file1,File file2) throws IOException {
        //创建新文件夹
        File newFile = new File(file2,file1.getName());
        newFile.mkdir();
        File[] files = file1.listFiles();
        if (files != null ) {
            for (File f : files) {
                if (f.isFile()) {
                    FileInputStream fis = new FileInputStream(f);
                    FileOutputStream fos = new FileOutputStream(new File(newFile,f.getName()));
                    byte[] bytes = new byte[8 * 1024];
                    int len;
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes,0,len);
                    }
                    fis.close();
                    fos.close();
                }else {
                    copyfileTo(f,newFile);
                }
            }
        }
    }
}
