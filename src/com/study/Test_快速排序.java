package com.study;

/**
 * 快速排序 (比较排序类)
 * 每次排序将待排记录分割两部分,一部分都比关键字小,一部分都比关键字大
 */
public class Test_快速排序 {
    public static void main(String[] args) {

    }

    public void quickSort(int[] arr) {
        Qsort(arr, 1, arr.length - 1);
    }

    public void Qsort(int[] arr, int start, int end) {
        int pivot = 0;
        if (start < end) {
            //将arr[start,end]一分为二,算出枢轴值pivot,该值得位置固定,不用再变化
            pivot = partition(arr, start, end);
        }

        //对两边的数组分别排序
        Qsort(arr, start, pivot - 1);
        Qsort(arr, pivot + 1, end);
    }


    //  选择一个枢轴值(关键字) 把它放到某个位置 使其左边的值都比它小 右边的值都比它大
    public int partition(int[] arr, int start, int end) {
        int pivotkey;
        pivotkey = arr[start];
        //顺序很重要，要先从右边找
        while (start < end) {
            while (start < end && arr[end] >= pivotkey) {  //从后往前找到比key小的放到前面去
                end--;
            }
            swap(arr, start, end);
            while (start < end && arr[start] <= pivotkey) {  //从前往后找到比key大的 放到后面去
                start++;
            }
            swap(arr, start, end);
        } //遍历所有记录  start的位置即为 key所在位置, 且固定,不用再改变
        return start;
    }

    //交换数组的两个位置
    public void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}


