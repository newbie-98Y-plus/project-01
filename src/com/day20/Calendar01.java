package com.day20;

import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
        Calendar cd = Calendar.getInstance();
        System.out.println(cd);
        int[] arr = new int[8];
        for (int i = 0;i < arr.length;i++) {
            arr[i] = i;
            System.out.print(cd.get(arr[i]) + "-");
        }
        System.out.println();
        printCalendar(cd);

    }

    public static void printCalendar(Calendar cd) {
        int year = cd.get(Calendar.YEAR);
        int month = cd.get(Calendar.MONTH) + 1;
        int day = cd.get(Calendar.DATE);
        int hour = cd.get(Calendar.HOUR);
        int minute = cd.get(Calendar.MINUTE);
        int second = cd.get(Calendar.SECOND);
        String week = getWeek(cd.get(Calendar.DAY_OF_WEEK));
        System.out.println(year + "年" + month + "月"+ day + "日"+ hour + "时"+ minute + "分"+ second + "秒"+ week);
    }

    public static String getWeek(int i) {
        String[] week = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return week[i];
    }
}
