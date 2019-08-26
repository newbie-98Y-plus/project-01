package com.day27;

import java.io.*;

public class Test_对象输出流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person pers = new Person("牛魔王",809);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt"));
        oos.writeObject(pers);
        oos.writeObject(new Person());
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));
        Object obj = ois.readObject();
        System.out.println(ois.readObject());
        ois.close();
        System.out.println(obj);
    }
}
