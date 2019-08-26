package com.day28;

public class Demo_线程休眠 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);//线程休眠
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("bang,你死了");
            }
        }.start();
    }
}
