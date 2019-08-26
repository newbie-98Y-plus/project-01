package com.day31;

public class Demo_Lambda表达式 {
    public static void main(String[] args) {
        MyInter mi = new MyInter() {
            @Override
            public void show() {
                System.out.println("hello world");
            }
        };
        mi.show();

        /*()Lambda表达式重写方法的形式参数
        ->分隔符
        {}方法的方法体，lambda体
        */
        MyInter mm = () -> {
            System.out.println("你好，我好，大家都好");
        };
        mm.show();
    }
}
interface MyInter {
    void show();
}