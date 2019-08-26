package com.day18;
//给出一句英文句子： "let there be light"
//得到一个新的字符串，每个单词的首字母都转换为大写
public class String16 {
    public static void main(String[] args) {
        String str = "let there be light";
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i].substring(0,1).toUpperCase()).append(strings[i].substring(1)).append(" ");
        }
        System.out.println(sb.toString().trim());


    }
}
