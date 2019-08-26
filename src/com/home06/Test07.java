package com.home06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//当我们下载一个试用版软件,没有购买正版的时候,每执行一次就会提醒我们还有多少次使用机会
//用学过的IO流知识,模拟试用版软件,试用10次机会,执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
public class Test07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("1.txt"));
        FileOutputStream fos = new FileOutputStream("2.txt");
        for (int i = 10; i <= 1; i--) {

            fos.write(i);
        }
        fos.close();

    }
}
