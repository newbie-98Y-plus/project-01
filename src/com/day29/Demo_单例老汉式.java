package com.day29;

public class Demo_单例老汉式 {
    public static void main(String[] args) {
        MyInstance3 mi1 = MyInstance3.mi;//直接调用mi对象
        MyInstance3 mi2 = MyInstance3.mi;
        System.out.println(mi1 == mi2);
    }
}
class MyInstance3 {
    private MyInstance3() {

    }
    public static final MyInstance3 mi = new MyInstance3();
}
