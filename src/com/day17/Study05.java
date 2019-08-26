package com.day17;

public class Study05 {
    public static void main(String[] args) {
        for (int i = 0; i < 9999; i++) {
            new Demo();
        }
    }
}
class Demo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾对象滚回去");
    }
}