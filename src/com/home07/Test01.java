package com.home07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1、有100张火车票，使用三个线程模拟三个窗口，同时贩卖，打印买票情况，例如：
 *     窗口1卖出了一张票，还剩99张
 *     窗口2卖出了一张票，还剩98张
 *     ...
 *     窗口3卖出了一张票，还剩1张
 *     窗口2卖出了一张票，还剩0张
 */
public class Test01 {
    public static void main(String[] args) {
        SaleTask st = new SaleTask(100);
        Thread t1 = new Thread("窗口1") {
            @Override
            public void run() {
                while (st.getP() > 0) {
                    st.sale();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //System.out.println(this.getName() + "卖出了一张票,还剩" + st.getP() + "张");
                }
            }
        };
        Thread t2 = new Thread("窗口2") {
            @Override
            public void run() {
                while (st.getP() > 0) {
                    st.sale();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //System.out.println(this.getName() + "卖出了一张票,还剩" + st.getP() + "张");
                }
            }
        };
        Thread t3 = new Thread("窗口3") {
            @Override
            public void run() {
                while (st.getP() > 0) {
                    st.sale();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //System.out.println(this.getName() + "卖出了一张票,还剩" + st.getP() + "张");
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
    }
}
class SaleTask {
    private int p;

    public SaleTask(int p) {
        this.p = p;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public synchronized void sale() {
        p = p - 1;
        System.out.println(Thread.currentThread().getName()+ "卖出了一张票,还剩" + getP() + "张");
    }
}
