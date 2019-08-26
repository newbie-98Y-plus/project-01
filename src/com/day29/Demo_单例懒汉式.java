package com.day29;

public class Demo_单例懒汉式 {
    public static void main(String[] args) {
        MyInstance2 mi1 = MyInstance2.getInstance();
        MyInstance2 mi2 = MyInstance2.getInstance();
        System.out.println(mi1 == mi2);

    }
}
class MyInstance2 {
    private MyInstance2() {

    }
    private static MyInstance2 mi = new MyInstance2();
    public static MyInstance2 getInstance() {
        if (mi == null) {//同步锁效率太低，过滤一下
            synchronized (MyInstance2.class) {//同步锁，确保当前内容不被其他线程影响
                if (mi == null) {
                    mi = new MyInstance2();
                }
            }
        }
        return mi;
    }
}