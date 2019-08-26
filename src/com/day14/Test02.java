package com.day14;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String pattern = "yyyy-MM-dd";
        String str = sc.next();
        SimpleDateFormat sd = new SimpleDateFormat(pattern);

    }
}
