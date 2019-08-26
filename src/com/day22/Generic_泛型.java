package com.day22;


import java.util.ArrayList;

public class Generic_泛型 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("123");
        al.add("456");
        al.add("789");
        for (int i = 0; i < al.size(); i++) {
            String str = al.get(i);
            System.out.println(str);
        }
    }
}
