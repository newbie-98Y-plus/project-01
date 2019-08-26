package com.day31;

public class Demo_Lambda表达式省略 {
    public static void main(String[] args) {
        MyInter2 m2 = () -> System.out.println("0个参数的()不可以省略，一条语句的{}可以省略");
        m2.show();

        MyInter3 m3 = a -> System.out.println("1个参数的()可以省略 " + (a * a));
        m3.show(5);

        MyInter4 m4 = (a,b,c) -> a + b + c;
        m4.show(3,4,5);
    }
}
interface MyInter2 {
    public abstract void show();
}
interface MyInter3 {
    public abstract void show(int a);
}
interface MyInter4 {
    public abstract int show(int a,int b,int c);
}