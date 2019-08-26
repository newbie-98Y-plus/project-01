package com.day28;


public class Demo_多线程 {
    public static void main(String[] args) throws InterruptedException {
        test_实现();

    }

    private static void test_实现() throws InterruptedException {
        Thread tr = new Thread(new MyRunnable());
        tr.start();//线程开启
        for (int i = 0; i <= 100; i++) {
            System.out.println("王二梦☟☟☟");
            Thread.sleep(1000);
        }
    }

    private static void test_继承() throws InterruptedException {
        Student stu = new Student();
        stu.start();
        for (int i = 0; i <= 100; i++) {
            System.out.println("王二梦☟☟☟");
            Thread.sleep(1000);
        }
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("(ᕦ(･ㅂ･)ᕤ-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Student extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("(:3[▓▓]快醒醒开学了--" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}