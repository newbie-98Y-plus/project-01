package com.day29;
//假设加血线程运行得更加频繁，英雄的最大血量是1000
//设计加血线程hurt和减血线程recover的交互，让回血回满之后，加血线程等待，直到有减血线程减血
public class Test_线程交互 {
    public static void main(String[] args) {
        Hero h = new Hero();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        h.hurt();
                        //Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        h.recover();
                        //Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Hero {
    private String name;
    private int hp = 1000;
    public synchronized void hurt() throws InterruptedException {
            if (hp <= 1) {
                this.wait();
            }
            hp = hp - 50;
            System.out.println("1剩余血量" + hp);
            this.notify();

    }
    public synchronized void recover() throws InterruptedException {
            if (hp >= 1000) {
                this.wait();
            }
            hp = hp + 50;
            System.out.println("2剩余血量" + hp);
            this.notify();
    }


}
