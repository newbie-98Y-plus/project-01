package com.day13;

import java.util.Date;

//定义商品类Goods作为抽象类
//   属性：商品ID    商品名称   商品类别  商品价格  保质期  上架时间   库存
//   在无参数的构造方法中给库存赋默认值100
//   普通方法：show 输出商品的详细信息
//   抽象方法：销售商品的方法     修改商品价格的方法    商品下架的方法     商品打折销售的方法（参数：打几折）
//子类Drink饮料类继承自抽象类Goods  要求实现抽象类中的所有抽象方法
//在带主方法的测试类中测试 （录屏）
public class Test02 {
    public static void main(String[] args) {
        Goods d = new Drink();
        d.saleGoods("可乐");
        System.out.println(d.revisePrice(50));
        d.dismount("0222");
        System.out.println(d.discount(50,0.85));
    }
}
class Drink extends Goods{

    @Override
    void saleGoods(String name) {
        System.out.println("不好卖");
    }

    @Override
    double revisePrice(double price) {
        return price;
    }

    @Override
    void dismount(String id) {


    }

    @Override
    double discount(double price, double b) {
        return price*b;
    }


}



abstract class Goods{
    private String id;
    private String name;
    private String category;
    private double price;
    private int wdate;
    private int date;
    private int num;
    abstract void saleGoods(String name);
    abstract double revisePrice(double  price);
    abstract void dismount(String id);
    abstract double discount(double price,double b);



    Goods(){
        num = 100;
    }
    void show(){
        System.out.println("商品ID"+id+"商品名称"+name+"商品类别"+category+"商品价格"+price+"保质期"+wdate+"上架时间"+num+"库存");
    }

}