package com.day18;
/**
 * 英文绕口令
 * peter piper picked a peck of pickled peppers
 * 统计这段绕口令有多少个以p开头的单词
 */

public class String13 {
    public static void main(String[] args) {
        String str = "peter piper picked a peck of pickled peppers";
        String[] strings = str.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].indexOf("p") == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
