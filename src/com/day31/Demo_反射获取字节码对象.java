package com.day31;

public class Demo_反射获取字节码对象 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Person("张三",35,"♂");
        //对象名.getclass()
        Class c1 = p.getClass();
        //类名.class
        Class c2 = Person.class;

        //不需要加载对象，通过全类名获取该字节码对象
        Class c3 =  Class.forName("com.day31.Person");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
