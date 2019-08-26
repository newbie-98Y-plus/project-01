package com.home02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            sb.append(" ");
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
        System.out.println("-----------");
        StringBuffer sb1 = new StringBuffer();
        long l3 = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            sb1.append(" ");
        }
        long l4 = System.currentTimeMillis();
        System.out.println(l4 - l3);

    }

}

