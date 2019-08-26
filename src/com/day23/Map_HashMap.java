package com.day23;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Map_HashMap {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("zhangsan",23);
        Student stu3 = new Student("zhangsan",23);
        hm.put(stu1,stu1.toString());
        hm.put(stu2,stu2.toString());
        hm.put(stu3,stu3.toString());
        System.out.println(hm);
    }
}
class Student {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private int age;

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

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}