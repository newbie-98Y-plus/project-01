package com.day20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse(str));
        System.out.println(sdf.format(sdf.parse(str)));
        long time = sdf.parse(str).getTime();
        long time1 = new Date().getTime();
        System.out.println((time1 - time)/1000/60/60/24/365);

        System.out.println();


    }
}
