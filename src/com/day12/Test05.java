package com.day12;

import java.util.Scanner;

//开发一个邮政储蓄系统，功能有登陆，取款，存款，查询，退出，
// 现在有小明，小红和小李三个人账户分别有2000元，1000元，500元，
// 现登陆系统，输入名字进入到对应的账号中，登陆成功后，会出现如下效果：
//欢迎进入邮政储蓄系统，请选择您的操作：（录屏）
//1、查询余额     2、取款        3、存款         4、退出
//如果选择1、则查看自身余额
//如果选择2、则进入取款页面效果如下：
//			请输入您要提取的金额：
//如果金额超过余额，则提示余额不足，
// 如果金额是负数提示输入错误，输入正确的金额后，对应的余额将会减少
//如果选择3、则进入存款功能，效果如下：
//			请输入您要存入的金额：
//并将输入的金额加入到余额中
//如果选择4、则退出系统并提示：
//		谢谢，再见！
public class Test05 {
    public void login(String name) {
        System.out.println("欢迎进入邮政储蓄系统，请选择您的操作：");
        System.out.println("1、查询余额     2、取款        3、存款         4、退出");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int c = 0;
        int a = 0;
        int b = 0;
        int i = Balance(name);
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
            if (arr[j] == 1) {
                if (name == "小明") {
                    System.out.println("余额为2000元");
                }
                if (name == "小红") {
                    System.out.println("余额为1000元");
                }
                if (name == "小李") {
                    System.out.println("余额为500元");
                }
            }
            if (arr[j] == 2) {
                System.out.println("请输入您要提取的金额：");
                a = sc.nextInt();
                if (a > Balance(name)) {
                    System.out.println("余额不足");
                } else if (a < 0) {
                    System.out.println("输入错误");
                } else {
                    System.out.println("取出金额:" + a);
                    i = (Balance(name) - a);
                    System.out.println("余额为:" + i);
                }
            }
            if (arr[j] == 3) {
                System.out.println("请输入您要存入的金额：");
                b = sc.nextInt();
                System.out.println("余额为:" + (i + b));
            }
            if (arr[j] == 4) {
                System.out.println("谢谢，再见！");
                return;
            }

        }

    }
    public static int Balance(String name){
        if(name == "小明"){
            return 2000;
        }
        if(name == "小红"){

            return 1000;
        }
        if(name == "小李"){
            return 500;
        }
        return 0;
    }
}
