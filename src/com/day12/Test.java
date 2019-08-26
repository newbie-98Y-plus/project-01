package com.day12;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("华为");
        p.setPrice(6789);
        p.call();
        p.sendMessage();
        p.palygame();
        Student stu = new Student();
        stu.setChinese(93);
        stu.setEnglish(89);
        stu.setMath(78);
        stu.getSum();
    }
}
