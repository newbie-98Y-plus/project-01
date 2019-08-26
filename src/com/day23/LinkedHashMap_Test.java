package com.day23;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LinkedHashMap_Test {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("123",489);
        lhm.put("345",789);
        lhm.put("098",980);
        lhm.put("098",98);
        lhm.put("",null);
        lhm.put(null,null);
        System.out.println(lhm.size());
        System.out.println(lhm);
    }
}
