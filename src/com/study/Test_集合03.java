package com.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//500个人围城一个圈,从1开始报数，每数到3的倍数的人离开圈子，循环往复直到最后圈中只剩下一人为止，
// 求剩下的人原来在圈中的位置(类似  约瑟夫环) （泛型版本，前面数组练习题中有数组版本的实现例子）
// 结果：435
public class Test_集合03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 501; i++) {
            list.add(i);
        }
        int i = 0;
        int count = 0;
        while (list.size() != 1) {
            count++;
            if (count%3 == 0) {
                list.remove(i);
                i--;
            }
            i++;
            if (i == list.size()) {
                i = 0;
            }
        }
        System.out.println(list);

    }
}
