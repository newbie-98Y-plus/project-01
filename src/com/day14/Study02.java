package com.day14;

public class Study02 {
    static int count = 0;
    {
        count++;
    }
    Study02(){
    }
    Study02(int a){
        this();
    }


    public static void main(String[] args) {
        new Study02();
        System.out.println(count);
        new Study02();
        System.out.println(count);

    }
}
