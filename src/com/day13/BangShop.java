package com.day13;
//定义一个支付接口 interface  Pay
//①	账号验证的方法（参数：账号admin，密码123456）
//即：public  void    checkAccount(String  name,String  pwd);
//②	付款的方法（参数：支付多少）
//即：public  void   getMoney(double  money);
//     ③	转账的方法（参数：转账多少）
//即：public  void  setMoney(double  money);
//2) 子类：邦购网上商城实现支付接口Pay
//3) 子类：HelloWorld商城实现支付接口Pay
//4) 子类：数码在线实现支付接口
public class BangShop implements Pay {

    @Override
    public void checkAccount(String name, String pwd) {
        if(!(name == "admin"&&pwd == "123456")){
            return;
        }else
            System.out.println("支付");
    }

    @Override
    public void getMoney(double money) {
        System.out.println("付款");

    }

    @Override
    public void setMoney(double money) {
        System.out.println("转账"+money);

    }
}
