package com.study;


public class Demo_Find {

    public static void main(String[] args) {
        int[] arr = {11,22,35,46,64,71,84,96};
        int result = getIndex(arr, 120);
        System.out.println(result + " ");
    }

    public static int getIndex(int[] arr, int value) {//传进去一个有序数列，和你要查找的值
        int min = 0;//一个最小索引初始化
        int max = arr.length - 1;//一个最大索引初始化
        int middle = (min+max)/2;//一个中间索引初始化

        while (arr[middle] != value) {
            if(arr[middle] > value) {//查找的值如果在中间值的左边，则需要更新最大索引
                max = middle-1;
            }else if(arr[middle] < value) {
                min = middle+1;//查找的值如果在中间值的右边，则需要更新最小索引
            }

            middle = (min+max)/2;//别忘了还需要更新中间索引

            if(min>max) return -1;//如果最小索引大于最大索引证明没有找到这个value，要退出循环
        }

        return middle;
    }
}
