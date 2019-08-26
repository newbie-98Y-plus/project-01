package com.day18;
//定义一个方法，统计第一个参数字符串中，包含几个第二个参数字符串的个数
//例如在字符串pqabcabcxyabc6666abcqabwcer中，有4个
public class String04 {
    public static void main(String[] args) {
        System.out.println(count("pqabcabcxyabc6666abcqabwcer","abc"));

    }
    public static int count(String str,String substr){
        int count = 0;
        int index = 0;
        while((index = str.indexOf(substr,index)) != -1){
            count++;
            index = index + substr.length();
        }
        return count;
    }
}
