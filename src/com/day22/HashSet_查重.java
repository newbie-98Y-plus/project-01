package com.day22;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashSet;

public class HashSet_查重 {
    public static void main(String[] args) {
        String[] str = new String[100];
        HashSet<String> has = new HashSet<>();
        for (int i = 0; i < 100; i++) {
           str[i] = RandomStringUtils.randomAlphanumeric(2);
        }
        for (String s : str) {
            has.add(s);
        }
        System.out.println(has);
        System.out.println(has.size());
    }
}
