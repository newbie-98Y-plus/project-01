package com.day18;

import org.apache.commons.lang3.RandomStringUtils;

//String与StringBuffer的性能区别?
//生成10位长度的随机字符串
//然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
//然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
public class String18 {
    public static void main(String[] args) {
        String[] str = new String[1000001];
        StringTest(str);

        //StringBuider(str);


    }

    private static void StringBuider(String[] str) {
        StringBuilder sb = new StringBuilder();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < str.length; i++) {
            sb.append(RandomStringUtils.randomAlphanumeric(10));
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }

    private static void StringTest(String[] str) {
        long start = System.currentTimeMillis();
        for (int i = 0;i < str.length - 1;i++) {
             str[i] = RandomStringUtils.randomAlphanumeric(10);
             String strs = str[i] + str[i + 1];
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
