package com.day12;
//创建一个Animal抽象类，类中有属性color，sex，封装，有个输出属性的show方法，
// 定义一个抽象eat方法。创建一个翅膀接口，定义一个抽象方法fly。
// 创建一个bird类继承Animal类并实现fly接口，重写eat方法，输出“鸟儿吃虫”，
// 重写fly方法输出“鸟儿飞翔”。创建一个腮接口，定义一个抽象方法swim。
// 创建一个Fish类继承animal类并实现腮接口，重写eat方法“鱼吃虾”，重写swim方法，
// 输出“鱼用腮呼吸游泳”。
//创建Bird对象，用set方法给属性赋值，并输出属性，调用eat方法和fly方法
//创建Fish对象，用构造方法赋值，输出属性，调用eat方法和swim方法
public class Study04 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.setColor("灰白");
        b.setSex("雌");
        b.show();
        b.eat();
        b.fly();
        Fish f = new Fish("金色","母");
        f.show();
        f.eat();
        f.swim();

    }
}
