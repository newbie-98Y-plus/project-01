package com.day29;

public class Demo_线程安全问题02 {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            SaveMoney sm = new SaveMoney();
            Thread t1 = new Thread(sm);
            Thread t2 = new Thread(sm);
            t1.start();
            t2.start();
        }

    }
}
class SaveMoney implements Runnable {
    private int money = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                money = money + 1;
            }
        }

        System.out.println(Thread.currentThread().getName() + "账户余额" + money);
    }
}

