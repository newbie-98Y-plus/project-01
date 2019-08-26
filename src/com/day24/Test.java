package com.day24;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Book[] book = { new Book("三国演义","11"),
                new Book("水浒传","22"),
                new Book("西游记","33"),
                new Book("红楼梦","44")
        };
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (Book b :book) {
            try {
                if (line.equals(b.getName())) {
                    System.out.println(line.equals(b.getName()));
                }else {
                    throw new Exception();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
