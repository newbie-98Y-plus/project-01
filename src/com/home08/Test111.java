package com.home08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

/**
 * 已知一个类，定义如下：
 * 	 * package com.ujiuye;
 * 	 * 		public class DemoClass {
 * 				public void run() {
 * 					System.out.println("welcome to ujiuye!");
 *                                }* 			}
 * 	 * (1) 写一个Properties格式的配置文件，配置类的完整名称。
 * 	 * (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法。
 */
public class Test111 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties prop = new Properties();
        //getClassLoader类加载
        //getResource---URL资源对象
        ClassLoader classLoader = Test111.class.getClassLoader();
        System.out.println("1111111111");
        URL resource = classLoader.getResource("com\\home08\\democlass.properties");
        System.out.println(resource);
        System.out.println("1111111111");
        assert resource != null;
        String path1 = resource.getPath();
        System.out.println(path1);
        System.out.println("1111111111");
        prop.load(new FileInputStream(path1));
        /*String name = Test_反射.class.getClassLoader().getResource("democlass.properties").getPath();
        System.out.println(name);
        prop.load(new FileInputStream(name));*/

        /*InputStream path = Test_反射.class.getClassLoader().getResourceAsStream("democlass.properties");
        prop.load(path);*/

       // prop.load(new FileInputStream("untitled\\src\\com\\home08\\democlass.properties"));
        String classname = prop.getProperty("classname");

        Class c = Class.forName(classname);
        Object obj = c.newInstance();
        Method m = c.getMethod("run");
        m.invoke(obj);
    }
}
