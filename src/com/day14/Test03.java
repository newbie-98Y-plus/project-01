package com.day14;

public class Test03 {
    public static void main(String[] args) {
        Program pro = new Program();
        pro.knockcode();
        Manager man = new Manager();
        man.control();
    }

}

class Program extends Staff {
    public void knockcode() {
        System.out.println("敲代码");
    }
}
class Manager extends Staff {
    private double bonus;
    public void control() {
        System.out.println("项目进度控制");
    }
}
class Staff{
    private String name;
    private int proNo;
    private double salary;
}
