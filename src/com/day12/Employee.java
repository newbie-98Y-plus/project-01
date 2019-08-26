package com.day12;

public abstract class Employee {
    private String name;
    private String id;
    private int salary;
    public void show(){
        System.out.println(name +'\t' + id + '\t'+ salary);
    }
    public abstract void manage();



    public Employee() {

    }

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
