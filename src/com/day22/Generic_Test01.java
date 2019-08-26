package com.day22;


import java.util.LinkedList;


public class Generic_Test01 {
    public static void main(String[] args) {
        Generic_泛型集合<String> str = new Generic_泛型集合<>();
        str.push("123");
        str.push("456");
        str.push("789");
        System.out.println(str.get());
        System.out.println(str.toString());
        str.pop();
        System.out.println(str.toString());
    }
}
//定义一个带有泛型的集合，只能在集合的头部进行增删
class Generic_泛型集合<T> {
    private LinkedList<T> lkl = new LinkedList<>();
    public void push(T t) {
        lkl.addFirst(t);
    }
    public void pop() {
        lkl.removeFirst();
    }

    public T get() {
        T t = lkl.getFirst();
        return t;
    }
    @Override
    public String toString() {
        return "Generic_泛型集合{" +
                "lkl=" + lkl +
                '}';
    }
}
