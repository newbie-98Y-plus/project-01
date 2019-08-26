package com.day30;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo_UDP编程接收端 {
    public static void main(String[] args) throws IOException {
        //创建通信点，接收端，指定端口号
            DatagramSocket ds = new DatagramSocket(6666);
            //准备接收字节数据的容器数组
            byte[] buf = new byte[1024];
            //指定接收的数据长度
            int len = buf.length;
            //创建数据报包裹
            DatagramPacket dp = new DatagramPacket(buf, len);
            //接收端接收包裹
            ds.receive(dp);
            //解析包裹
            System.out.println(new String(dp.getData(), 0, dp.getLength()));
    }
}
