package com.home02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 	键盘录入一个正整数n，创建一个大小为n的数组
 * 	键盘录入m（m <= n）个整数，存入上述数组，
 * 	当录入字符串"end"或者录入个数达到n时，结束录入
 * 	并且将数组内容、数组最大值按照指定格式进行输出
 * 	例如：
 * 		请录入数组大小：
 * 		10
 * 		请录入若干整数
 * 		2
 * 		4
 * 		5
 * 		6
 * 		7
 * 		end
 * 		最终结果为：[2, 4, 5, 6, 7, 0, 0, 0, 0, 0], 最大值为7
 */
public class Test01 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println("请录入数组大小：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String[] arr = new String[i];
        System.out.println("请录入若干整数");
        int[] brr = new int[i];

        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.next();
            if(arr[j].equals("end")) {
                break;
            }else {
                brr[j] = Integer.parseInt(arr[j]);
                count++;
            }

        }
        System.out.println(Arrays.toString(brr)+",最大值为:"+getMax(brr,count));
        long ll = System.currentTimeMillis();
        System.out.println(ll-l);
    }
    public static int getMax(int[] arr,int count) {
        int max = arr[0];
        for (int i = 0; i < count; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;


    }

}
