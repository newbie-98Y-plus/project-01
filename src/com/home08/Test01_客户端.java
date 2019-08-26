package com.home08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 需求：
 * 	客户端向服务器写字符串(键盘录入),
 * 	服务器(多线程)将字符串反转后写回,
 * 	客户端再次读取到是反转后的字符串
 */
public class Test01_客户端 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(),7878);

        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        while (true) {
            System.out.println("发送的信息:------------------");
            pw.println(new Scanner(System.in).nextLine());

            String str = br.readLine();
            System.out.println("收到的信息:-------------------" );
            System.out.println(str);
        }

        //s.close();
    }
}
