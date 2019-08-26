package com.day19;

public class System01 {
    public static void main(String[] args) {
        whileTime();

    }
    private static void whileTime() {
        long l = System.currentTimeMillis();
        int i = 0;
        while(i < 9999999){
            System.out.print("1");
            i++;
        }
        long l1 = System.currentTimeMillis();
        System.out.println();
        System.out.println((l1 - l)/1000);
    }

    private static void forTime() {//22s
        long l = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            System.out.print(1);
        }
        long l1 = System.currentTimeMillis();
        System.out.println();
        System.out.println((l1 - l)/1000);
    }
}
