package com.day12;
//请打印一副扑克牌（大小王除外）（录屏）
//评分标准
//1、正确定义数组
//2、正确使用循环
//3、正确的格式
//4、最终结果
public class Test03 {
    public static void main(String[] args) {
        String[][] srr = new String[4][13];
        for (int i = 0; i < srr.length; i++) {
            for (int j = 1; j < srr[i].length+1; j++) {
                if(j == 1){
                    System.out.print('A');
                }else if(j >= 2&&j <= 10){
                    System.out.print(j);
                }else if(j == 11){
                    System.out.print('J');
                }else if(j == 12){
                    System.out.print('Q');
                }else
                    System.out.print('K');
            }
            if(i == 0){
                System.out.println("红心");
            }else if(i == 1){
                System.out.println("方块");
            }else if(i == 2)
                System.out.println("黑桃");
            else
                System.out.println("黑花");

        }

    }
}
