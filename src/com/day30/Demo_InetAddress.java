package com.day30;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo_InetAddress {
    public static void main(String[] args) throws IOException {
        InetAddress ia = InetAddress.getLocalHost();
        String ip = ia.getHostAddress();
        String name = ia.getHostName();
        System.out.println(ia.toString());
        System.out.println(name);
        System.out.println(ip);

        Process p = Runtime.getRuntime().exec("ipconfig");
        System.out.println(p);
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"gbk"));
        StringBuilder sb = new StringBuilder();
        String len;
        while ((len = br.readLine()) != null) {
            sb.append(len).append("\r\n");
        }
        System.out.println(sb.toString());

    }
}
