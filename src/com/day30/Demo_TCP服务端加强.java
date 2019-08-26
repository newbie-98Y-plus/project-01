package com.day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_TCP服务端加强 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(5655);
        ExecutorService es =  Executors.newFixedThreadPool(3);
        Runnable ra =  new Runnable() {
                @Override
                public void run() {
                    try {
                        //接收请求
                        Socket s = ss.accept();
                        //获取Socket对象的网络输入流，并加强为带缓冲的字符流
                        //接收客户端发送的数据
                        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        String str = br.readLine();
                        System.out.println(str);

                        ////获取Socket对象的网络输出流，并加强为带自动刷新的打印流
                        //发送数据到客户端
                        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                        pw.println(new Scanner(System.in).nextLine());

                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            };
        while (true) {
            es.submit(ra);
        }
    }
}
