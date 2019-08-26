package com.day28;

public class Demo_Thread常用方法 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName());//内部调用getName()方法
            }
        };
        System.out.println(t1.getName());//使用getName()方法
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());//当前线程对象的引用的getName()方法
            }
        });
        System.out.println(t2.getName());//使用getName()方法
        t2.start();
    }
}
