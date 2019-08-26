package com.home07;

/**
 * 同时开启3个线程，共同输出100~200之间的所有数字，并且在输出奇数的时候将线程名称打印出来
 */
public class Test03 {
    public static void main(String[] args) {
        Num n = new Num();
        Thread t1 = new Thread(n,"甲");
        Thread t2 = new Thread(n,"乙");
        Thread t3 = new Thread(n,"丙");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Num implements Runnable {
    private int i = 100;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (i < 200) {
            synchronized (this) {
                if (i < 200) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "..." + getI());
                    }
                    i++;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
