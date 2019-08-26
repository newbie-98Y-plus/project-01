package com.day22;

import java.util.Arrays;
import java.util.Comparator;

public class Generic_通配符 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("zhangsan",23),
                new Person("zhangsi",23),
                new Person("aaaaali",23),
                new Person("lisi",24),
                new Person("wangwu",25),
                new Person("ezzzwu",25),
                new Person("zhaoliu",26)
        };

        System.out.println("aaa".compareTo("aaab"));
        Arrays.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                if(!(o1.getAge() == o2.getAge())) {
                    //年龄降序排列
                    return o2.getAge() - o1.getAge();
                }
                else {
                    if (!(o1.getName().length() == o2.getName().length())) {
                        //年龄相同按照姓名长度的升序排序
                        return o1.getName().length() - o2.getName().length();
                    } else//长度相同按照姓名字典序升序排序
                        return o1.getName().charAt(0) - o2.getName().charAt(0);
                }
            }
        });
        System.out.println(Arrays.toString(persons));


    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

