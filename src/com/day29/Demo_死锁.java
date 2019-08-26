package com.day29;

public class Demo_死锁 {
    public static void main(String[] args) {
        //同步代码块的嵌套，导致两条线程发生死锁
        Thread t1 = new Thread("甲") {
            @Override
            public void run() {
                while (true) {
                    synchronized ("锁A") {
                        System.out.println(getName() + "锁A,need锁B");
                        synchronized ("锁B") {
                            System.out.println(getName() + "锁B,解锁");
                        }
                    }
                }
            }
        };
        Thread t2 = new Thread("乙") {
            @Override
            public void run() {
                while (true) {
                    synchronized ("锁B") {
                        System.out.println(getName() + "锁B,need锁A");
                        synchronized ("锁A") {
                            System.out.println(getName() + "锁A,解锁");
                        }
                    }
                }
            }
        };
        t1.start();
        t2.start();

    }
}
