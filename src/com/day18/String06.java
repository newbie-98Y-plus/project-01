package com.day18;
//、键盘录入一个字符串，统计在字符串中，大写字母、小写字母、数字字符、其他字符的个数
//2、键盘录入一个字符串，输出首字母变大写，其余字母全部小写
import java.util.Arrays;
import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        StringBigSmall();
    }

    private static void StringNum() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        int num1 = 0,num2 = 0,num3 = 0,num4 = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                num1++;
            } else if (c[i] >= 97 && c[i] <= 122) {
                num2++;
            } else if (c[i] >= 48 && c[i] <= 57) {
                num3++;
            } else
                num4++;
        }
        System.out.println("大写字母:"+num1+"\n小写字母:"+num2+"\n数字字符:"+num3+"\n其他字符:"+num4);
    }

    private static void StringBigSmall() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] > 97&&c[i] <122){
                c[i] -= 32;
                break;
            }
        }
        System.out.println(String.valueOf(c));
    }
}
