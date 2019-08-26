package com.day18;

public class String12 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        getBuilder(sb);//world
        System.out.println(sb);//world


        /*StringBuilder sb = new StringBuilder("hello");
        getbuilder(sb); //world
        System.out.println(sb);*/ //hello

        /*String str = "hello";
        get(str);  //world
        System.out.println(str);*/  //hello
    }
    public static void get(String str) {
        str = "world";
        System.out.println(str);
    }
    public static void getbuilder(StringBuilder sb) {
        sb = new StringBuilder("world");
        System.out.println(sb);
    }
    public static void getBuilder(StringBuilder sb) {
        sb.replace(0,sb.length(),"world");
        System.out.println(sb);
    }

}
