package com.day19;

public class Regular02 {
    public static void main(String[] args) {
        String regex = "\\\\+";
        System.out.println("\\\\".matches(regex));
        System.out.println("\\");

        String regex1 = "\\+";
        System.out.println("+");
        System.out.println("+".matches(regex1));

        String regex2 = "\\?";
        System.out.println("?".matches(regex2));
        System.out.println("?".matches("\\D"));

        System.out.println("\\");

        System.out.println("\\".matches("\\\\"));

        System.out.println("-".matches("-"));
    }
}
