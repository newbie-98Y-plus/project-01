package com.day28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo_Properties文件交互 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("配置.properties"));//加载配置文件
        System.out.println(prop);
        prop.setProperty("name","wangwu");//修改属性值
        System.out.println(prop);
        prop.store(new FileOutputStream("配置.properties"),"update oldname to newname");//更新配置文件

        Properties sys = System.getProperties();//获取系统配置属性
        Set<String> set = sys.stringPropertyNames();
        for (String s : set
             ) {
            System.out.println(s + "===========>>" + sys.getProperty(s));
        }
        System.out.println("---------------------------------------------------------------");
        String str = sys.getProperty("user.name");
        String str1 = sys.getProperty("user1.name");//null
        System.out.println(str + "---" + str1);
    }
}
