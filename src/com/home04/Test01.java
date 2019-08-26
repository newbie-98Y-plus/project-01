package com.home04;

import java.util.LinkedList;

//1、自定义一个带泛型的集合，只能从头部删除，只能从尾部添加
public class Test01 {
    public static void main(String[] args) {
        MyColl<String> ml = new MyColl<>();
        ml.push("孙悟空");
        ml.push("猪八戒");
        ml.push("沙和尚");
        ml.push("唐三藏");
        ml.pop();
        System.out.println(ml.get("白龙马"));
        System.out.println(ml);
    }
}
class MyColl<T> {
    LinkedList<T> ll = new LinkedList<>();
    public void push(T t) {
        ll.addLast(t);
    }
    public void pop(){
        ll.removeFirst();
    }
    public T get(T t) {
        return t;
    }

    @Override
    public String toString() {
        return "MyColl{" +
                "ll=" + ll +
                '}';
    }
}
