package com.day20;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar03 {
    public static void main(String[] args) {
        Calendar cd = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        isTFyear(cd,i);
    }

    private static void isTFyear(Calendar cd, int i) {
        cd.set(i,1,28);
        cd.add(Calendar.DATE,1);
        //Calendar01.printCalendar(cd);
        if(cd.get(Calendar.DATE) == 29){
            System.out.println("是闰年");
        }else
            System.out.println("是平年");
    }
}
