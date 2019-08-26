package com.day18;

public class String09 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.insert(0,"12345678901234567");
        System.out.println(sb.capacity());
    }
}
