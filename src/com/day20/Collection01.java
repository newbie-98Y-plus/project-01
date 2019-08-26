package com.day20;

import java.util.ArrayList;
import java.util.Collection;

public class Collection01 {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        cc.add("ttyy");
        cc.add(223);
        cc.add('a');
        cc.addAll(cc);
        System.out.println(cc);
        System.out.println(cc.size());
        cc.remove(223);
        System.out.println(cc);
        System.out.println(cc.contains("ttyy"));
        System.out.println(cc.isEmpty());
        cc.clear();
        System.out.println(cc.isEmpty());

    }
}
