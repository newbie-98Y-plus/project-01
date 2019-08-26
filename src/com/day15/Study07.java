package com.day15;

public class Study07 {
    public static void main(String[] args) {
        Staff s = new Coder(14,"李三");
        Coder c = (Coder)s;
        System.out.println(s.getAge());
        System.out.println(c.getAge());
        System.out.println(c.getName());

    }
}
class Staff {
    private int age;
    Staff(){

    }
    Staff(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Coder extends Staff {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Coder(){

    }
    Coder(int age,String name){
        super(age);
        this.name = name;
    }
}