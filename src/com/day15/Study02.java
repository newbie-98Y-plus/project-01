package com.day15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Study02 {
    public static void main(String[] args) throws Exception {
        Jucie ju = new Jucie();
        BufferedReader br = new BufferedReader(new FileReader("D:\\D盘文件\\Idea\\project-01\\untitled\\src\\com\\day15\\Fuirt.txt"));
        String str = br.readLine();
        Class c = Class.forName(str);
        Object obj = c.newInstance();
        Fuirt f = (Fuirt)obj;
        ju.make(f);
    }
}
class Jucie {
    public void make(Fuirt f) {
        f.flow();
    }
}
abstract class Fuirt {
    public abstract void flow();
}
class Apple extends Fuirt {

    @Override
    public void flow() {
        System.out.println("苹果汁");
    }
}
class Orgain extends Fuirt {

    @Override
    public void flow() {
        System.out.println("橘子汁");
    }
}