package com.day29;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 生产者消费者问题是一个非常典型性的线程交互的问题。
 *
 * 1. 使用栈来存放数据
 * 1.1 把栈改造为支持线程安全
 * 1.2 把栈的边界操作进行处理，当栈里的数据是0的时候，访问pop的线程就会等待。
 * 当栈里的数据是200的时候，访问push的线程就会等待
 * 2. 提供一个生产者（Producer）线程类，生产随机大写字符压入到堆栈
 * 3. 提供一个消费者（Consumer）线程类，从堆栈中弹出字符并打印到控制台
 * 4. 提供一个测试类，使两个生产者和三个消费者线程同时运行，结果类似如下
 */
public class Test_生产者消费者 {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        new Thread(new Producer(ms),"生产者1").start();
        new Thread(new Producer(ms),"生产者2").start();
        new Thread(new Consumer(ms),"消费者1").start();
        new Thread(new Consumer(ms),"消费者2").start();
        new Thread(new Consumer(ms),"消费者3").start();

    }
}
class MyStack extends Stack {
    private List<Character> list = new ArrayList<>();
    @Override
    public synchronized Object pop() {
        while (list.size() <= 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        this.notifyAll();
        Object obj = list.remove(list.size() - 1);
        return obj;
    }

    @Override
    public synchronized Object push(Object item) {
        while (list.size() >= 200) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add((Character) item);
        this.notifyAll();
        return (Character) item;
    }

    public synchronized int size() {
        return list.size();
    }

}
class Producer implements Runnable {
    private MyStack ms;
    Producer(MyStack ms) {
        this.ms = ms;
    }
    @Override
    public void run() {
        while (true) {
            char c = getChar();
            ms.push(c);
            System.out.println(Thread.currentThread().getName() + "压入：" + c);
        }
    }
    public static char getChar() {
        return  (char)(Math.random() * 26 + 65);
    }
}
class Consumer implements Runnable {
    private MyStack ms;
    Consumer(MyStack ms) {
        this.ms = ms;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "弹出：" + ms.pop() + "-----当前栈中数据：" + ms.size());
        }
    }
    public static char getChar() {
        return  (char)(Math.random() * 26 + 65);
    }
}