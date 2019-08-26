package com.day11;

public class Study01 {
    String name;
    int age;

    @Override
    public String toString() {
        return "Study01[name = "+ name +",age = "+ age +"]";
    }

    public static void main(String[] args) {
        Study01 s = new Study01();
        s.age = 14;
        s.name = "ww";
        System.out.println(s.toString());

    }
}
