package com.day17;

import java.util.Objects;

public class Study04 {
    public static void main(String[] args) {
        Student s = new Student("李大",19);
        String str = s.toString();
        System.out.println(s.toString());
        Student s1 = new Student("李大",19);
        String str2 = s1.toString();
        System.out.println(str.equals(str2));
        System.out.println(s1 == s);
        System.out.println(s1.equals(s));
    }
}
class Student {
    private String name;
    private int age;

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

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}