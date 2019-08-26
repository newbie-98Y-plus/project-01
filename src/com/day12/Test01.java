package com.day12;
//1、定义一个Employee员工抽象类作为父类， 属性有：name (姓名，String类型)id（工号，String类型）
// salary（工资，int类型）属性要进行封装（对属性进行私有化，并提供setter和getter方法），定义无参构造
// 方法和传三个参数的有参构造方法。定义一个显示员工姓名、工号、工资的方法show。
// 再定义一个抽象方法manage (管理)。
//   2、定义一个Manager经理类继承Employee员工类，Manager有自己的特有属性：bonus (奖   	金，int类型)（
//   要求对奖金属性进行私有化，并提供setter和getter方法），
//   创建空		参构造方法和带四个参数的构造方法。
//   重写父类中的显示详细信息的方法show，在重	写的show方法中调用父类的show方法；并显示奖金信息。
//   重写方法manage (管理)	方法显示：做经理就是好，能管人！
//   3、定义测试类Test，创建一个Manager对象并赋值，调用show方法和manage方法
public class Test01 {
    public static void main(String[] args) {
        Manager manager = new Manager("李四","0001",23456,3333);
        manager.show();
        manager.manage();
    }
}
