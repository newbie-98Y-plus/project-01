package com.day30;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Demo_TCP客户端加强 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(),5655);
        //客户端发送数据到服务端
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        String line = new Scanner(System.in).nextLine();
        pw.println(line);

        //客户端接收服务端
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println(str);

        s.close();

    }

}
