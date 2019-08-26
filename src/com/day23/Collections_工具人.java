package com.day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//首先初始化一个List,长度是10，值是0-9。
//然后不断的shuffle，直到前3位出现
//3 1 4
//shuffle 1000,000 次，统计出现的概率
public class Collections_工具人 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        while (list.size() < 10) {
            int i = (int) (Math.random() * 10);
            if (!(list.contains(i))) {
                list.add(i);
            }
        }
        System.out.println(list);
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            Collections.shuffle(list);
            if (list.get(0) == 3 && list.get(1) == 1 && list.get(2) == 4) {
                count++;
            }
        }
        System.out.println(count);
    }

}
