package com.day28;

import static java.lang.System.gc;

public class Test_线程 {
    public static void main(String[] args) {
            Thread song = new Songer();
            song.setName("蔡徐坤");
            song.start();
            Thread song2 = new Thread(new Songess());
            song2.setName("w");
            song2.start();
    }
}
class Songer extends Thread {
    public void run() {
        System.out.println("大家好，我是" + getName());
        int count = 0;
        boolean k = true;
        while (k) {
            System.out.println("单挑，打篮球----" + getName() + "败"+ ++count);
            System.out.println("----------------------------------------");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                k = false;
                System.out.println(getName() + "是菜鸡");
            }
        }
    }

}
class Songess implements Runnable {

    @Override
    public void run() {
        System.out.println("大家好，我是" + Thread.currentThread().getName());
        int count = 0;
        boolean k = true;
        while (k) {
            System.out.println("单挑，打篮球----" + Thread.currentThread().getName() + "败"+ ++count);
            System.out.println("----------------------------------------");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                k = false;
                System.out.println(Thread.currentThread().getName() + "是菜鸡");
            }
        }
    }
}