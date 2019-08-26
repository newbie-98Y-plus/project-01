package com.home01;

public class Test01 {
   //(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
    //	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
    //	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
    //	(4)最终打印该数组中对称字符串的个数
    //
    //	提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。。。
   public static void main(String[] args) {
       String[] str = {"12361235","010","3223","666","7890987","123123"};
       int count = 0;
       for(int j = 0; j< str.length;j++){
       for(int i = 0;i < str[j].length();i++){
           if (str[j].charAt(i) == str[j].charAt(str[j].length()-1-i)){
           if(i == str[j].length()-1){
               System.out.println(str[j]+"是对称的");
               count++;
           }
           }else if(i == str[j].length()-1){
               System.out.println(str[j]+"不是对称的");
           }
       }
       }
       System.out.println(count);
   }


}
