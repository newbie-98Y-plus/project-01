package com.day31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo_榨汁机 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //榨汁机对象
        Juicer ju = new Juicer();
        //配置文件持久集合
        Properties pro = new Properties();
        //加载配置文件
        pro.load(new FileInputStream("untitled\\src\\com\\day31\\Fruit.properties"));
        //根据键获取值
        String furitName = pro.getProperty("fruitname");
        //获取对应值得字节码对象
        Class c = Class.forName(furitName);
        //创建对象
        Object obj = c.newInstance();
        //强转
        Fruit f = (Fruit)obj;
        //榨汁
        ju.makeJuice(f);

        pro.setProperty("number","13");
        pro.store(new FileOutputStream("untitled\\src\\com\\day31\\Fruit.properties"),null);

    }
}
class Juicer{
    public void makeJuice(Fruit f) {
        f.flow();
    }
}
interface Fruit {
    void flow();
}