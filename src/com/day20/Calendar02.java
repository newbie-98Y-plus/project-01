package com.day20;

import java.util.Calendar;

public class Calendar02 {
    public static void main(String[] args) {
        Calendar cd = Calendar.getInstance();
        cd.set(Calendar.YEAR,1000);
        System.out.println(cd.get(Calendar.YEAR));
        cd.set(2019,7,8);
        Calendar01.printCalendar(cd);
        System.out.println("------------");
        cd.set(2019,7,8,14,43,36);
        Calendar01.printCalendar(cd);

        cd.set(10,10);
        System.out.println(cd);
    }
}
