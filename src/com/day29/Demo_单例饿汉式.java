package com.day29;

public class Demo_单例饿汉式 {
    public static void main(String[] args) {
        MyInstance mi1 = MyInstance.getInstance();
        MyInstance mi2 = MyInstance.getInstance();
        //同一个对象
        System.out.println(mi1 == mi2);

    }
}
class MyInstance {
    //构造方法私有化
    private MyInstance(){

    }
    //创建该类对象，类静态的引用，直接创建对象
    private static MyInstance mi = new MyInstance();
    //提供获取该对象的公有方式，提供静态方法，返回引用
    public static MyInstance getInstance() {
        return mi;
    }
}