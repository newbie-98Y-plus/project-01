package com.day16;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        GenericClass<String,Integer> gcs = new GenericClass<>();
        String str = gcs.addElements("字符串");
        System.out.println(str);
        int a = gcs.removeElements(49);
        System.out.println(a);

    }
}
class GenericClass<T,M> {
    private ArrayList<T> als = new ArrayList<>();//成员变量
    private ArrayList<M> als1 = new ArrayList<>();
    public T addElements(T t) {//自定义方法
        als.add(t);
        System.out.println(als);
        return t;
    }
    public M removeElements(M m) {
        als1.add(m);
        als1.remove(m);
        System.out.println(als1);
        return m;
    }

}