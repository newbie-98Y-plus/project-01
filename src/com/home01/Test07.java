package com.home01;
//定义一个方法，统计第一个参数字符串中，包含几个第二个参数字符串的个数
//例如在字符串pqabcabcxyabc6666abcqabwcer中，有4个abc
//public static int count(String str, String subStr)
public class Test07 {
    public static void main(String[] args) {
        System.out.println(count1("pqabcabcxyabc6666abcqabwcer","abc"));
        System.out.println(count2("pqabcabcxyabc6666abcqabwcer","abc"));
        System.out.println(count3("pqabcabcxyabc6666abcqabwcer","abc"));
        System.out.println(count4("pqabcabcxyabc6666abcqabwcer","abc"));
        System.out.println(count1("abcttabvccabctabcabcuuabc","abc"));
        System.out.println(count2("abcttabvccabctabcabcuuabc","abc"));
        System.out.println(count3("abcttabvccabctabcabcuuabc","abc"));
        System.out.println(count4("abcttabvccabctabcabcuuabc","abc"));
    }

    public static int count4(String str, String subStr){
     //replaceFirst，通过contains方法判断是否包含子串，不包含则循环结束
        int count =0;
        while(str.contains(subStr)) {
            str = str.replaceFirst(subStr," ");
            count++;
        }
        return count;

    }
    public static int count3(String str, String subStr){//将所有子串替换成空串
        int count = 0;
        if(str.contains(subStr) == true) {
            int b = str.length();
            int a = str.replaceAll(subStr, "").length();
            count = (b - a) / subStr.length();
        }
        return count;
    }


    public static int count2(String str,String subStr) {//截取字符串
        int count = 0;
        while(true == str.contains(subStr)){
            //String str1 = str.substring(0,str.indexOf(subStr) + subStr.length());
            str = str.substring(str.indexOf(subStr) + subStr.length());
            count++;
        }
        return count;
    }



    public static int count1(String str, String subStr){//indexOf查询
        int count = 0;
        int index = 0;
        while((index = str.indexOf(subStr,index)) != -1){
            count++;
            index = index + subStr.length();
        }
        return count;
    }
}
