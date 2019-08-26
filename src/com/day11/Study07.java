package com.day11;

public class Study07 {
    public static void main(String[] args) {
        String str = "good good study";
        //String[] s2 = {"333","3333333"};
        System.out.println(str.length());//字符长度15
        System.out.println(str.charAt(5));//返回字符串中索引为5的字符
        System.out.println(str.substring(5));//获取一个字符串，内容从当前字符串的索引开始
        System.out.println(str.substring(5,10));//包头不包尾
        System.out.println(str.indexOf(0));
        byte[] bytes = str.getBytes();//转成字节数组
        System.out.println(bytes[0]);
        char[] cs = str.toCharArray();//转成字符数组
        System.out.println(cs[1]);
        System.out.println(str.toUpperCase());//转成大写
        System.out.println(str.toLowerCase());//转成小写
        int a = 123;
        String sn = String.valueOf(a);//转成字符串
        System.out.println(sn+100);

    }
}
