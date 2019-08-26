package com.day12;

public class Bird extends Animal implements Wing {
    @Override
    public void eat() {
        System.out.println("鸟儿吃虫");
    }

    @Override
    public void fly() {
        System.out.println("鸟儿飞翔");

    }
}
