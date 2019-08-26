package com.day30;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Demo_TCP服务端 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);

        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] rd = new byte[1024];
        int len;
        len =is.read(rd);
        System.out.println(new String(rd, 0,len));


        OutputStream os = s.getOutputStream();
        String str = new Scanner(System.in).nextLine();
        os.write(str.getBytes());

        s.close();



    }
}
