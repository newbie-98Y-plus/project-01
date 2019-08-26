package com.day31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Demo_函数型接口 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"123","456","678");

        //List<Integer> resultList = turnFun(list, s -> Integer.parseInt(s));
        //方法的引用
        List<Integer> resultList = turnFun(list, Integer::parseInt, x -> x/3);
        System.out.println(resultList);

    }
    //将给定的参数应用到这个函数上
    public static List<Integer> turnFun(List<String> list, Function<String,Integer> fun1, Function<Integer,Integer> fun2) {
        ArrayList<Integer> al = new ArrayList<>();
        for (String s : list) {
            int result = fun1.andThen(fun2).apply(s);
            al.add(result);
        }
        return al;
    }
}
