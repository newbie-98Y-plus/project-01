package com.day18;

/**
 * Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
 * 把最后一个two单词首字母大写
 */
public class String15 {
    public static void main(String[] args) {
        String str = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int i = str.lastIndexOf("two");
        char[] c = str.toCharArray();
        c[i] -= 32;
        System.out.println(String.valueOf(c));

    }
}
