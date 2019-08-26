package com.day24;

public class ThrowThrowable {
    public static void main(String[] args) {
        Person p = new Person();
        try{
            p.setAge(-12);
           // p.setName("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(p);
    }
}
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name != "") {
            this.name = name;
        }else {
            throw new Exception("姓名不能为空:" + name);//抛出编译时异常必须声明或捕获
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }else {
            throw new RuntimeException("年龄非法:" + age);//抛出运行时异常不需要声明和捕获
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}