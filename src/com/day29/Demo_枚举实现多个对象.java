package com.day29;

public class Demo_枚举实现多个对象 {
    public static void main(String[] args) {
        MyWeekday1 won = MyWeekday1.WON;
        MyWeekday1 teu = MyWeekday1.TEU;
        MyWeekday1 wen = MyWeekday1.WEN;
        System.out.println(won);
        System.out.println(teu);
        System.out.println(wen);

        System.out.println(MyWeekday01.WON);
        System.out.println(MyWeekday01.TEU);
        System.out.println(MyWeekday01.WEN);
    }
}
class MyWeekday1 {
    //手动实现枚举多例
    private MyWeekday1() {

    }
    public static final MyWeekday1 WON = new MyWeekday1();
    public static final MyWeekday1 TEU = new MyWeekday1();
    public static final MyWeekday1 WEN = new MyWeekday1();
}
enum MyWeekday01 {
    //枚举类型实现多例
    WON,TEU,WEN;
}