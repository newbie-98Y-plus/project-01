package com.test;

import java.util.Scanner;

//有一对兔子，从出生后第3个月起每个月都生一对兔子，
// 小兔子长到第三个月后每个月又生一对兔子，
// 假如兔子都不死，问每个月的兔子总数为多少？
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        int mon = sc.nextInt();
        int num = getNum(mon);
        System.out.println(num);
    }
    public static int getNum(int mon) {
        if (mon == 1 || mon == 2) {
            return 1;
        } else {
            return getNum(mon - 1) + getNum(mon - 2);
        }
    }
}
