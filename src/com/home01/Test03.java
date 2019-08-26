package com.home01;

import java.util.Scanner;

//(1)从键盘循环录入录入一个字符串,输入"end"表示结束
//	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
//		举例:
//			键盘录入：Hello12345World
//			输出结果：hELLO*****wORLD
//					  总共10个字母
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 0;i<100;i++){
            String str = sc.nextLine();
            String[] s1 = new String[133333];
            if(str.endsWith("end")){
                int endIndex = str.lastIndexOf("end");
                str = str.substring(0,endIndex);
                char[] c = str.toCharArray();
                for (int j = 0; j < c.length; j++) {
                    if (c[j] >= 65 && c[j] <= 90) {
                        c[j] = (char) (c[j] + 32);
                        count++;
                    } else if (c[j] >= 97 && c[j] <= 122) {
                        c[j] = (char) (c[j] - 32);
                        count++;
                    } else
                        c[j] = '*';
                    s1[j] = String.valueOf(c[j]);
                    System.out.print(s1[j]);
                }

            }else{
                System.out.println("以end结尾");
            }
            System.out.println("\n总共"+count+"个字母");

        }

    }
}
