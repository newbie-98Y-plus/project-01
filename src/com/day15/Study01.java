package com.day15;

public class Study01 {
    public static void main(String[] args) {
        A a = new C();
        ((C) a).show();
    }
}
class A {
    /*private void show() {
        System.out.println(1);
    }*/
}
class B extends A {
    void show() {
        System.out.println(2);
    }
}
class C extends B {
    void show() {
        System.out.println(3);
    }
}