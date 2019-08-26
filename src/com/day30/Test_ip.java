package com.day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 首先获取 获取本机IP地址，比如说是192.168.2.100。 那么本网段的ip地址就是从 192.168.2.1 到 192.168.2.255
 * 再通过使用java 执行ping命令 判断这些ip地址能否使用，把能够使用的ip打印出来
 */
public class Test_ip {
    public static void main(String[] args) throws IOException {
        InetAddress ia = InetAddress.getLocalHost();
        String ip = ia.getHostAddress();
        System.out.println(ip);//本机IP地址
        System.out.println(ip.substring(0,ip.lastIndexOf(".") + 1));
        int count = 0;
        for (int i = 1; i <= 255; i++) {
            ip = ip.substring(0, ip.lastIndexOf(".") + 1) + i;

            Process p = Runtime.getRuntime().exec("ping " + ip);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "gbk"));
            StringBuilder sb = new StringBuilder();
            String len;
            while ((len = br.readLine()) != null) {
                sb.append(len).append("\r\n");
            }
            //System.out.println(sb.toString());
            if (!sb.toString().contains("无法访问目标主机")) {
                System.out.println(ip + "已用");
                count++;
            }
        }
        System.out.println(count);
    }
}
