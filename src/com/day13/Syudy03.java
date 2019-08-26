package com.day13;
//纸厚0.01m，珠穆朗玛峰8848米，叠几次能够超过珠穆朗玛峰？
public class Syudy03 {
    public static void main(String[] args) {
        double i = 8848;
        int count = 0;
        for (int j = 0; j < 100; j++) {
            if((i = i/2)>0.01){
                count++;
            }
        }
        System.out.println(count);

    }
}
