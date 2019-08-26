package com.day30;

import java.io.IOException;
import java.net.*;

public class Demo_UDP编程发送端 {
    public static void main(String[] args) throws IOException {
        //创建通信点,发送端
        DatagramSocket ds = new DatagramSocket();
        String str = "hello world";
        //发送的字节数据
        byte[] buf = str.getBytes();
        //从数组的哪个位置发送
        int offset = 0;
        //发送多少数据
        int lenth = buf.length;
        //发送到的ip
        byte[] ip = {10,10,108, (byte) 206};
        InetAddress address = InetAddress.getByAddress(ip);
        //指定端口号
        int port = 6666;
        //数据报包
        DatagramPacket dp = new DatagramPacket(buf,offset,lenth,address,port);
        //发送端发送包裹
        ds.send(dp);

    }
}
