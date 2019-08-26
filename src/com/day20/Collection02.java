package com.day20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection02 {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        cc.add("123");
        cc.add("456");
        cc.add(789);
        cc.addAll(cc);
        Object[] obj = cc.toArray();
        for (int i = 0; i < obj.length; i++) {
            Object o = obj[i];
            System.out.print(o);
        }
        System.out.println();
        for (Iterator iterator = cc.iterator(); iterator.hasNext(); ) {
           // Object next =  iterator.next();
            System.out.print(iterator.next());
        }




    }
}
