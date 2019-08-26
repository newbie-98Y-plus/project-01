package com.day15;

public class Study03 {
    public static void main(String[] args) {
        Computer cpt = new Computer();
        cpt.open();
        cpt.useDev(new Mouse());
        cpt.useDev(new KeyBoard());
        cpt.close();
    }
}
class Computer {
    public void open() {
        System.out.println("开机");
    }
    public void close() {
        System.out.println("关机");
    }
    public void useDev(USB u) {
        u.use();
        u.powerOn();
        u.powerOff();
    }
}
interface USB {
    public abstract void use();
    public abstract void powerOn();
    public abstract void powerOff();
}
class Mouse implements USB {

    @Override
    public void use() {
        System.out.println("点点点");
    }

    @Override
    public void powerOn() {
        System.out.println("能点");
    }

    @Override
    public void powerOff() {
        System.out.println("不能点");

    }
}
class KeyBoard implements USB {

    @Override
    public void use() {
        System.out.println("敲敲敲");
    }

    @Override
    public void powerOn() {
        System.out.println("能敲");
    }

    @Override
    public void powerOff() {
        System.out.println("不能敲");
    }
}