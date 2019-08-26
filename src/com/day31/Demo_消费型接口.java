package com.day31;

import java.util.function.Consumer;

public class Demo_消费型接口 {
    public static void main(String[] args) {
        //消费型接口处理一个数据
        Mobile m = new Mobile("8848",8848);

        updateprice(m,x -> x.setPrice(x.getPrice() + 1000));
        System.out.println(m);
    }

    public static void updateprice(Mobile m, Consumer<Mobile> con) {
        //接口实现类对象处理数据
        con.accept(m);
    }
}
