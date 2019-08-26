package com.day31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo_Stream获取 {
    public static void main(String[] args) {
        Collection<Integer> con = new ArrayList<>();
        Collections.addAll(con,123,456,789,987,654,321);

        Stream<Integer> stream = con.stream();
        System.out.println(stream);
        //终结方法count(),forEach(Consumer con)
        long count = stream.count();
        System.out.println(count);
        //stream已经关闭，需再次创建
        Stream<Integer> stream1 = con.stream();
        stream1.forEach(x-> System.out.println(x + 100));
        System.out.println("-----------------------------");
        //延迟方法
        Stream<Integer> stream2 = con.stream();
        stream2.filter(x -> x % 2 == 0).filter(x -> x > 400).forEach(x-> System.out.println(x));



        /*int[] arr = {1,2,3,4,5};
        Stream<int[]> arr1 = Stream.of(arr);
        System.out.println(arr1);*/


    }
}
