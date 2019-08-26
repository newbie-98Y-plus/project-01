package com.day27;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test_序列化对象 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //test_01();
       test_02();

    }

    private static void test_02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("yyy.txt"));
        Object obj = ois.readObject();
        ois.close();
        ArrayList<Person> al = (ArrayList<Person>)obj;
        for (Person p : al
             ) {
            System.out.println(p.getName() + ".." +p.getAge());
        }
    }

    private static void test_01() throws IOException {
        ArrayList<Person> al = new ArrayList<>();
        Collections.addAll(al,new Person("铁扇公主",789),new Person("红孩儿",19));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("yyy.txt"));
        oos.writeObject(al);
        oos.close();
    }
}
