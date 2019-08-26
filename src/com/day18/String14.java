package com.day18;

/**
 * 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
 * 把 lengendary 最后一个字母变大写
 */
public class String14 {
    public static void main(String[] args) {
        String str = "lengendary";
        char[] c = str.toCharArray();
        c[c.length-1] -= 32;
        System.out.println(new String(c));


    }

    private static void test01_间隔大小写(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i += 2) {
            c[i] -= 32;
        }
        System.out.println(new String(c));
    }
}
