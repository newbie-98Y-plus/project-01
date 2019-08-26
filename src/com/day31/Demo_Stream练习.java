package com.day31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo_Stream练习 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        Collections.addAll(al,"宫本武藏", "宋公明","苏有明","石头人","时传祥","李耳","庄子","洪七公");
        Collections.addAll(al2,"帕瓦罗蒂","张三疯","赵薇薇","张自忠","孛儿只斤铁木真","张天爱","张翠花");
        Stream<String> stream1 = al.stream()
                .filter(x -> x.length() == 3)
                .limit(3);

        Stream<String> stream2 = al2.stream()
                .filter(x -> x.startsWith("张"))
                .skip(2);

        Stream<String> concat = Stream.concat(stream1, stream2);

        //Stream<Person> personStream = concat.map(x -> new Person(x));
        Stream<Person> personStream = concat.map(Person::new);
        ArrayList<Person> per = new ArrayList<>();
        //personStream.forEach(x -> per.add(x));
        personStream.forEach(per :: add);
        System.out.println(per);

    }
}
