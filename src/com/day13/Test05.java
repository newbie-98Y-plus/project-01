package com.day13;
//需求：定义一个长方形类,定义求周长和面积的方法，然后定义一个测试类进行测试。
public class Test05 {
    public static void main(String[] args) {
        Oblong ol = new Oblong();
        System.out.println("周长:"+ol.girth(10,8));
        System.out.println("面积:"+ol.Area(10,8));
    }
}
class Oblong{
    int girth(int long1,int wide){
        return (long1+wide)*2;
    }
    int Area(int long1,int wide){
        return long1*wide;
    }
}