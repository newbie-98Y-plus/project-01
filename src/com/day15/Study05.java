package com.day15;

public class Study05 {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        int a = 10;
        class A1 {
            public void show() {
                System.out.println(a);
            }
        }
        A1 a1 = new A1();
        a1.show();
    }

}
