package com.day12;

public class Fish extends Animal implements Gill{
    @Override
    public void eat() {
        System.out.println("鱼吃虾");
    }

    @Override
    public void swim() {
        System.out.println("鱼用鳃呼吸游泳");

    }

    public Fish() {
        super();
    }
    public Fish(String color,String sex){
        super(color,sex);
    }
}
