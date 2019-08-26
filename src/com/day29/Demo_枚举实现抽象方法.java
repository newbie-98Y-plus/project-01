package com.day29;

public class Demo_枚举实现抽象方法 {
    public static void main(String[] args) {
        MyWeekday3 won = MyWeekday3.WON;
        MyWeekday3 teu = MyWeekday3.TEU;
        MyWeekday3 wen = MyWeekday3.WEN;
        System.out.println(won.getName());
        won.show();
        System.out.println(teu.getName());
        teu.show();
        System.out.println(wen.getName());
        wen.show();

        System.out.println("-------------------------");
        MyWeekday03 WON1 = MyWeekday03.WON;
        WON1.show();
        MyWeekday03 TEU1 = MyWeekday03.TEU;
        TEU1.show();
        MyWeekday03 WEN1 = MyWeekday03.WEN;
        WEN1.show();


        System.out.println(WON1.compareTo(TEU1));//WON比TEU序号小，返回-1----(0 - 1)
        System.out.println(TEU1.ordinal());//返回枚举项TEU1的序数1
        System.out.println(WON1.toString());//重写后的toString方法,未重写也可调用
        System.out.println(WEN1.name());//枚举项的名字
        System.out.println(MyWeekday03.values());//返回枚举类型的数组包含所有枚举项
        System.out.println(MyWeekday03.values().length);
        MyWeekday03[] mw = MyWeekday03.values();
        System.out.println(mw[2].getName());



    }
}
abstract class MyWeekday3 {
    private String name;
    abstract void show();

    public MyWeekday3(String name) {
        this.name = name;
    }

    public static final MyWeekday3 WON = new MyWeekday3("星期一") {
        @Override
        void show() {
            System.out.println("今天：" + WON.name);
        }
    };
    public static final MyWeekday3 TEU = new MyWeekday3("星期二") {
        @Override
        void show() {
            System.out.println("今天：" + TEU.name);
        }
    };
    public static final MyWeekday3 WEN = new MyWeekday3("星期三") {
        @Override
        void show() {
            System.out.println("今天：" + WEN.name);
        }
    };

    @Override
    public String toString() {
        return "MyWeekday3{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

enum MyWeekday03 {
    WON("星期一"){
        @Override
        void show() {
            System.out.println("今天：" + MyWeekday03.WON.name);
        }
    },TEU("星期二") {
        @Override
        void show() {
            System.out.println("今天：" + MyWeekday03.TEU.name);
        }
    },WEN("星期三") {
        @Override
        void show() {
            System.out.println("今天：" + MyWeekday03.WEN.name);
        }
    };
    private String name;
    abstract void show();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    MyWeekday03(String name) {
        this.name = name;
    }

    /*@Override
    public String toString() {
        return "MyWeekday03{" +
                "name='" + name + '\'' +
                '}';
    }*/
}