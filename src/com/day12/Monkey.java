package com.day12;

public class Monkey {
    private String name;
    private int age;
    public void ride(){
        System.out.println("骑车");
    }
    public void show(){
        System.out.println(name+age);
    }

    public Monkey() {
    }

    public Monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
