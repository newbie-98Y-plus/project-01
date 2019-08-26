package com.home05;

import java.util.*;

//(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
//	(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
//	(3)利用四种方式遍历Map集合中的内容，格式：key::value
public class Test01 {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("三藏",30),"东土大唐");
        map.put(new Student("悟空",530),"花果山");
        map.put(new Student("悟能",430),"天庭");
        map.put(new Student("悟净",330),"天庭");
        System.out.println(map);
        //map_遍历一(map);
        //map_遍历二(map);
        //map_遍历三(map);
        map_遍历四(map);


    }

    private static void map_遍历四(Map<Student, String> map) {
        Set<Map.Entry<Student,String>> set = map.entrySet();
        Iterator<Map.Entry<Student,String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Student,String> en = it.next();
            System.out.println(en.getKey() + "::" + en.getValue());
        }
    }

    private static void map_遍历三(Map<Student, String> map) {
        Set<Map.Entry<Student, String>> set = map.entrySet();
        for (Map.Entry<Student,String> en : set) {
            System.out.println(en.getKey() + "::" + en.getValue());
        }
    }

    private static void map_遍历二(Map<Student, String> map) {
        Set<Student> set = map.keySet();
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu + "::" + map.get(stu));
        }
    }

    private static void map_遍历一(Map<Student, String> map) {
        Set<Student> set = map.keySet();
        for (Student stu : set) {
            String str = map.get(stu);
            System.out.println(stu + "::" + str);
        }
    }
}



class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}