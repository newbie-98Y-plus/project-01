package com.day24;

public class Throwable_异常方法 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        }catch (Exception e) {
            System.out.println(e.getCause());//异常原因
            System.out.println(e.toString());//异常简短信息
            System.out.println(e.getMessage());//异常详细信息
            System.out.println(e.getLocalizedMessage());//异常本地信息
            e.printStackTrace();//打印异常的调用栈轨迹
        }
    }
}
