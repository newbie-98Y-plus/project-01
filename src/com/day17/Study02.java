package com.day17;

public class Study02 {
    protected int age = 10;
    String name = "王二";
    protected void show() {
        System.out.println("00000000000000");
    }

    public static void main(String[] args) {
        Study02 s = new Study02();
        System.out.println(s.age);
        System.out.println(s.name);
        s.show();
    }
}
