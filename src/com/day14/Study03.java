package com.day14;

public class Study03 {
    public static void main(String[] args) {
        Man m = new SuperMan();
        System.out.println(m.name);
        m.dealBusiness();
        SuperMan sm = new SuperMan();
        System.out.println(sm.name);
        sm.fly();

    }
}
class Man {
   String name = "Mike";
   public void dealBusiness(){
       System.out.println("普通生意");
   }

}
class SuperMan extends Man {
    String name = "spader";

    @Override
    public void dealBusiness() {
        System.out.println("几个亿的大单子");
    }
    public void fly(){
        System.out.println("飞飞侠");
    }
}