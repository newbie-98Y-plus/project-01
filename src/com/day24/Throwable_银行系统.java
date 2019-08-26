package com.day24;

import java.util.Scanner;

/**
 * 这是一个类图
 * Account类： 银行账号
 * 属性： balance 余额
 * 方法： getBalance() 获取余额
 * 方法： deposit() 存钱
 * 方法： withdraw() 取钱
 * OverdraftException： 透支异常，继承Exception
 * 属性： deficit 透支额
 */
public class Throwable_银行系统 {
    public static void main(String[] args) {
        Account ac = new Account(1000,0);
        Scanner sc = new Scanner(System.in);
        System.out.println("1-->进入系统,其它-->退出系统");
        int i = 1;
            while (i == sc.nextInt()) {
                System.out.println("您当前余额" + ac.getBalance());//显示余额
                System.out.println("请输入存钱数：");
                ac.deposit(sc.nextDouble());//存钱
                try {
                    System.out.println("请输入取钱数");
                    ac.wuthdrw(sc.nextDouble());//取钱
                } catch (OverdraftException e) {
                    e.printStackTrace();
                }
            }
    }


}
class Account {
    protected double balance;//余额
    protected double deficit;//透支额

    public double getDeficit() {
        return deficit;
    }

    public void setDeficit(double deficit) {
        this.deficit = deficit;
    }

    public Account() {
    }

    public Account(double balance,double deficit) {
        this.balance = balance;
        this.deficit = deficit;
    }
    public Account(double balance) {
        this.balance = balance;
    }

    //获取余额
    public  double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //存钱
    public void deposit(double amt) {
        System.out.println("您已存入：" + amt);
        balance = balance + amt;
        System.out.println("您当前余额：" + balance);
    }
    //取钱
    public void wuthdrw(double amt) throws OverdraftException {
        System.out.println("取出余额：" + amt);
        if (amt > getBalance()) {
            deficit = amt - getBalance();
            throw new OverdraftException("余额不足，已透支：",deficit);
        }else {
            balance = balance - amt;
            System.out.println("剩余余额：" + balance);
        }
    }
}
class OverdraftException extends Exception {
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public void setDeficit(double deficit) {
        this.deficit = deficit;
    }

    public OverdraftException() {

    }
    public OverdraftException(String message,double deficit) {
        super(message);
        this.deficit = deficit;
    }
    /*public void printStackTrace() {
        System.out.println("您的余额不足");
    }*/
}
class CheckingAccount extends Account {
    private double overdraftProtection;//透支额度
    public CheckingAccount(double balance) {
        super(balance);
    }
    public CheckingAccount(double balance,double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double amt) throws OverdraftException {
        System.out.println("取出余额：" + amt);
        if (amt > balance) {
            deficit = amt + overdraftProtection - getBalance();
            throw new OverdraftException("余额不足，已透支：",deficit);
        }else {
            balance = balance - amt;
            System.out.println("剩余余额：" + balance);
        }
    }


}