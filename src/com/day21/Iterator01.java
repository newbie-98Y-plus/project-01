package com.day21;

import com.sun.deploy.panel.ITreeNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        cc.add(new Person("zhangsan",25));
        cc.add(new Person("lisi",24));
        cc.add(new Person("wangwu",15));

        Iterator it = cc.iterator();
        while (it.hasNext()) {
            /*Object obj = it.next();
            Person p = (Person) obj;
            System.out.println(p.getName() + "..." + p.getAge());*/
            System.out.println(((Person)(it.next())).getName() + "..." + it.getClass());
        }
    }


}
