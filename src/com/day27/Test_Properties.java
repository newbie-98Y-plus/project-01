package com.day27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test_Properties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("x.txt"));
        Set set = prop.stringPropertyNames();
        System.out.println(set);
    }
}
