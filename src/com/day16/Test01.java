package com.day16;

import com.day17.Study02;

public class Test01 extends Study02 {
    public static void main(String[] args) {
        Study02 s = new Study02();
        //System.out.println(s.age);
        //System.out.println(s.name);
        Test01 t = new Test01();
        System.out.println(t.age);
        //System.out.println(t.name);
        t.show();

    }
}
