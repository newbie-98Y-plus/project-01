package com.day12;

public class Manager extends Employee {
    @Override
    public void manage() {
        System.out.println("做经理就是好，能管人！");

    }
    private int bonus;
    public void show(){
        super.show();
        System.out.println(bonus);
    }

    public Manager() {

    }

    public Manager(String name, String id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
