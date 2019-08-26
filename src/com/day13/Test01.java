package com.day13;

public class Test01 {
    public static Test01 t = new Test01();
    {
        System.out.println("A");
    }
    static{
        System.out.println("B");
    }

    public static void main(String[] args) {
        Test01 t1 = new Test01();
    }
}
