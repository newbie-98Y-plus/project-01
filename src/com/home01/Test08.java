package com.home01;

public class Test08 {
    public static void main(String[] args) {
        /*String str = "xxxyyy";
        gets(str);
        System.out.println(str);*/
        StringBuilder sb = new StringBuilder("ee");
        getb(sb);
        System.out.println(sb);

    }
    public static void getb(StringBuilder sb) {
        sb = new StringBuilder("RR");
        sb.append("ww");
        System.out.println(sb);
    }
    public static void gets(String str){
        str = "qq" + str;
        System.out.println(str);
    }
}
