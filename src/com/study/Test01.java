package com.study;

import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {
        Object[] obj = new Object[2];
        obj[0] = new Person("lili",30);
        obj[1] = new Student("dada",15,"12345");
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].toString());
        }
    }

    private static void personTest() {
        Person[] p = new Person[2];
        p[0] = new Person("lili",30);
        p[1] = new Student("dada",15,"12345");
        for(int i = 0;i < p.length;i++){
            System.out.println(p[i].getName() + p[i].getAge());
            if(i == 1){
                Student s = (Student)p[i];
                System.out.println(s.getsId());
            }
        }
    }
}
class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Student extends Person {
    private String sId;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public Student(String name, int age, String sId) {
        super(name, age);
        this.sId = sId;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                "age='" + super.getAge() + '\'' +
                "sId='" + sId + '\'' +
                '}';
    }
}

