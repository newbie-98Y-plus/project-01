package com.day29;

public class Demo_线程状态 {
    public static void main(String[] args) throws InterruptedException {
        test_阻塞态同步锁();
    }

    private static void test_死亡态() throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 99999; i++) {

                }
            }
        };
        t1.start();
        Thread.sleep(20);
        System.out.println("死亡态：" + t1.getState());
    }

    private static void test_阻塞sleep() throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 99999; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        Thread.sleep(20);
        System.out.println("阻塞态(TIMED_WAITING)：" + t1.getState());//sleep
    }

    private static void test_阻塞态同步锁() {
        final Object lock = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 99999; i++) {

                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 99999; i++) {

                    }
                }
            }
        };
        t1.start();
        t2.start();
        System.out.println("阻塞态(BLOCKED)：" + t1.getState() + "..." + t2.getState());

    }

    private static void test1() {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 99999; i++) {

                }
            }
        };
        System.out.println("新建态：" + t1.getState());
        t1.start();
        System.out.println("就绪态和运行态：" + t1.getState());
    }
}
