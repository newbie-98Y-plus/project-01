package com.day29;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_线程池 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);//创建有两条线程的线程池
        MyTask m1 = new MyTask();
        MyTask m2 = new MyTask();
        MyTask m3 = new MyTask();
        es.submit(m1);
        es.submit(m2);
        es.submit(m3);//提交3个任务，未执行的任务等待
        List<Runnable> notrun = es.shutdownNow();//结束线程池，返回没有执行的任务
        System.out.println(notrun);//FutureTask,Runnable的实现类

    }
}
//创建任务类
class MyTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 999; i++) {
            System.out.println(Thread.currentThread().getName() + ".." + i);
        }
    }

}
