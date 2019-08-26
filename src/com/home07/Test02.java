package com.home07;

/**
 * 有一辆班车除司机外只能承载80个人，假设前中后三个车门都能上车，如果坐满则不能再上车。
 *    请用线程模拟上车过程并且在控制台打印出是从哪个车门上车以及剩下的座位数。
 *    比如:
 *   	（前门上车---还剩N个座...）
 */
public class Test02 {
    public static void main(String[] args) {
        Bus b = new Bus();
        Thread t1 = new Thread(b);
        t1.setName("前门");
        Thread t2 = new Thread(b);
        t2.setName("中门");
        Thread t3 = new Thread(b);
        t3.setName("后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Bus implements Runnable {
    private int sate = 80;

    public int getSate() {
        return sate;
    }

    public void setSate(int sate) {
        this.sate = sate;
    }

    @Override
    public void run() {
        while (sate > 0) {
                synchronized (this) {
                    if (sate > 0) {
                        sate = sate - 1;
                        System.out.println(Thread.currentThread().getName() + "上车" + "---" + "还剩" + getSate() + "个座");
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
        }
    }
}