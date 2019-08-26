package com.day15;

public class Study06 {
    public static void main(String[] args) {
        new Intar(){


            @Override
            public void test() {
                System.out.println("--------");
            }
        }.test();

    }
}
interface Intar{
    public abstract void test();
}