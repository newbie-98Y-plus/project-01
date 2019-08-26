package com.day18;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("录入用户名");
            String str = sc.nextLine();
            System.out.println("录入密码");
            String str1 = sc.nextLine();
            if(str.equals("admin")&&str1.equals("123")){
                System.out.println("登录成功");
                return;
            }
            else if(i == 0){
                System.out.println("还有两次机会");
            }else if(i == 1){
                System.out.println("还有一次机会");
            }else
                System.out.println("登录机会已经用完");
        }
    }
}
