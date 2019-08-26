package com.day29;

public class Demo_线程锁对象 {
    public static void main(String[] args) {
        MySyn my = new MySyn();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    my.print1();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    my.print2();
                }
            }
        }.start();
    }
}
class MySyn {
    public void print1() {
        synchronized ("qq") {
            System.out.print("h");
            System.out.print("e");
            System.out.print("l");
            System.out.print("l");
            System.out.println("o");
        }
    }
    public void print2() {
        synchronized ("qq") {
            System.out.print("w");
            System.out.print("o");
            System.out.print("r");
            System.out.print("l");
            System.out.println("d");
        }
    }
}