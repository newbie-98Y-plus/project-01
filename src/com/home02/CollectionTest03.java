package com.home02;

import java.util.*;

public class CollectionTest03 {
    public static void main(String[] args) {
        List cc = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            cc.add(str);
        }
        /*String str = "w333w";
        System.out.println(iszero(str));*/
        ListIterator listit = cc.listIterator();
        for (; listit.hasNext(); ) {
            if(iszero((String) listit.next())){
                listit.remove();
            }
        }
        System.out.println(cc);

    }
    public static boolean iszero(String str) {
        String regex = ".*\\d+.*";
        return str.matches(regex);
    }
}
