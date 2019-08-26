package com.day14;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Study07 {
    public static void main(String[] args) throws ParseException {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的生日yyyy-MM-dd");
        String str = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        long l = date.getTime();
        Date date1 = new Date();
        long ll = date1.getTime();
        long day = (ll-l)/1000/60/60/24/360;
        System.out.println(day);*/
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        cal.set(Calendar.YEAR,2020);
        System.out.println(cal.get(Calendar.YEAR));
        cal.add(Calendar.YEAR,-3);
        System.out.println(cal.get(Calendar.YEAR));
    }
}
