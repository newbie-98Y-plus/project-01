package com.day28;

/**
 * 英雄有可以放一个技能叫做: 波动拳-a du gen。
 * 每隔一秒钟，可以发一次，但是只能连续发3次。
 *
 * 发完3次之后，需要充能5秒钟，充满，再继续发。
 */
public class Test_英雄充能 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("波动拳第" + i + "发");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("开始为5秒蓄能");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
