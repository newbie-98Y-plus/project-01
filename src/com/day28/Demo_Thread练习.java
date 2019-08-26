package com.day28;

public class Demo_Thread练习 {
    public static void main(String[] args) throws Throwable {
        System.out.println(Thread.currentThread().getName());//主线程名称
        for (int i = 0;i <= 10000000; i++) {
            new Demo_Thread练习();
        }
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println(Thread.currentThread().getName());//垃圾回收线程名称
        System.out.println(Thread.currentThread().isDaemon());//是否是守护线程
    }


}
