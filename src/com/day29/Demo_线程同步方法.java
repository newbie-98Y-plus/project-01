package com.day29;

public class Demo_线程同步方法 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    MyStatic.print1();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    MyStatic.print2();
                }
            }
        }.start();
    }

}
class MyStatic {
    //静态方法的锁对象为当前类的字节码对象MyStatic.class
    public static synchronized void print1() {
        System.out.print("h");
        System.out.print("e");
        System.out.print("l");
        System.out.print("l");
        System.out.println("o");
    }
    public static void print2() {
        synchronized (MyStatic.class) {
            System.out.print("w");
            System.out.print("o");
            System.out.print("r");
            System.out.print("l");
            System.out.println("d");
        }
    }
}