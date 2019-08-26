package com.day31;

public class Mobile {
    private String bland;
    private int price;

    public Mobile() {
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "bland='" + bland + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBland() {
        return bland;
    }

    public void setBland(String bland) {
        this.bland = bland;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Mobile(String bland, int price) {
        this.bland = bland;
        this.price = price;
    }
}
