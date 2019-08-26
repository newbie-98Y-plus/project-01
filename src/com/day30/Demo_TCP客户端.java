package com.day30;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo_TCP客户端 {
    public static void main(String[] args) throws IOException {
        byte[] ip = {10, 10, 108, (byte) 206};
        InetAddress address = InetAddress.getByAddress(ip);
        Socket s = new Socket(address,7777);

        OutputStream os = s.getOutputStream();
        String str = new Scanner(System.in).nextLine();
        os.write(str.getBytes());




        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int len;
        len = is.read(b);
        System.out.println(new String(b,0,len));

        s.close();
    }
}
