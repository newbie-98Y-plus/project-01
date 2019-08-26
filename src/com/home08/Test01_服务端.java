package com.home08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test01_服务端 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7878);
        while (true) {
            Socket s = ss.accept();
            new Thread() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                        while (true) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(br.readLine());
                            System.out.println("收到的信息1:----------");
                            System.out.println(sb.toString());

                            String str = sb.reverse().toString();
                            System.out.println("发送的信息1:" + str);
                            pw.println(str);
                            s.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }.start();
        }


    }
}
