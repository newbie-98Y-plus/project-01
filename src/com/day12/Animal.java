package com.day12;

public abstract class Animal {
    private String color;
    private String sex;

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        System.out.println(color + sex);
    }
    public abstract void eat();

    public Animal(){

    }
    public Animal(String color,String sex){
        this.color = color;
        this.sex = sex;
    }
}
