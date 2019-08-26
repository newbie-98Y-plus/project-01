package com.day16;


import java.util.ArrayList;
import java.util.LinkedList;

public class GenericTest {

    public static void main(String[] args) {
        GenericList<String> gct = new GenericList<>();
        gct.addRemove("泛型");
    }
}
class GenericList<T> {
   LinkedList<T> llt = new LinkedList<>();
   public T addRemove(T t) {
       llt.addFirst(t);
       llt.addFirst(t);
       llt.removeFirst();
       System.out.println(llt);
       return t;
   }
}