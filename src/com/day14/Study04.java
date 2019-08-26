package com.day14;

import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Study04 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.getTime());
        DataFormat dataFormat = new DataFormat();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String str = simpleDateFormat.format(date);
        System.out.println(str);
        Date date1 = simpleDateFormat.parse(str);
        System.out.println(date1);
    }
}
