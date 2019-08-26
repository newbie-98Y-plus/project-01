package com.day15;

public class Study04 {
    public static void main(String[] args) {
        Home.House hh = new Home.House();
        hh.show();
        Home h = new Home();
        h.show();
    }
}
class Home {
    private int people = 10;
        public void show(){
            System.out.println("_______________");
        }
    static class House{
        private int a = 3333;
        public void show() {
            System.out.println("...........");
        }
    }
}
