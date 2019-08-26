package com.day25;

import java.io.UnsupportedEncodingException;

public class FileInputSteam_Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "牛牛";
        byte[] bytes = str.getBytes("utf-8");
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
    }
}
