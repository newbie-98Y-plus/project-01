package com.day28;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class Demo_Properties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("name","zhangsan");
        prop.setProperty("age","25");
        prop.setProperty("sex","nan");
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s + "..." + value);
        }
    }
}
