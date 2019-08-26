package com.day23;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Hashset_原理 {
    public static void main(String[] args) {
        HashSet<Person> has = new HashSet<>();
        Collections.addAll(has,
                new Person("zhangsan",23),
                new Person("zhangsan",23),
                new Person("zhangsan",23),
                new Person("lisi",24),
                new Person("lisi",25)
                );
        System.out.println(has);
        for (Person p : has) {
            System.out.println(p.hashCode());
        }
    }
}
class Person {
    private String name;
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person pers = (Person)obj;
        if (this.age == pers.age && this.name.equals(pers.name)) {
            return true;
        }
        return false;
    }

    /*@Override
    public int hashCode() {
        return 123456;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}