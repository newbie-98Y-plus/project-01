package com.home01;
//键盘录入一个字符串，统计该字符串中的大写字母、小写字母、数字字符和其他字符分别有多少个
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < 100; i++) {
            String str = sc.nextLine();
                char[] c = str.toCharArray();
                for (int j = 0; j < c.length; j++) {
                    if (c[j] >= 65 && c[j] <= 90) {
                        count++;
                    } else if (c[j] >= 97 && c[j] <= 122) {
                        count1++;
                    } else if (c[j] >= 48 && c[j] <= 57) {
                        count2++;
                    } else
                        count3++;
                }
            System.out.println("大写字母个数:" + count);
            System.out.println("小写字母个数:" + count1);
            System.out.println("数字个数:" + count2);
            System.out.println("其他字符个数:" + count3);

        }
    }
}
