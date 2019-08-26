package com.day29;

public class Demo_枚举实现带有变量的对象 {
    public static void main(String[] args) {
        MyWeekday2 won = MyWeekday2.WON;
        MyWeekday2 teu = MyWeekday2.TEU;
        MyWeekday2 wen = MyWeekday2.WEN;
        System.out.println(won.getName());
        System.out.println(teu.getName());
        System.out.println(wen.getName());

        System.out.println("---------------------------");

        System.out.println(MyWeekday02.WON.getName());
        System.out.println(MyWeekday02.TEU.getName());
        System.out.println(MyWeekday02.WEN.getName());

    }
}


class MyWeekday2 {
    //手动实现枚举多例
    private String name;
    private MyWeekday2(String name) {
        this.name = name;
    }
    public static final MyWeekday2 WON = new MyWeekday2("星期一");
    public static final MyWeekday2 TEU = new MyWeekday2("星期二");
    public static final MyWeekday2 WEN = new MyWeekday2("星期三");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyWeekday2{" +
                "name='" + name + '\'' +
                '}';
    }
}
enum MyWeekday02 {
    //枚举类型实现多例
    WON("星期一"),TEU("星期二"),WEN("星期三");
    private String name;

    MyWeekday02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}