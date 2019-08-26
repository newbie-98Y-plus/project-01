package com.home01;
//定义一个方法，功能如下：给定一个数组，转换成一个字符串
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1,35,55,3345};
        System.out.println(int2string(arr));
    }
    private static String int2string(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            /*if(i == arr.length - 1){
                sb.append(arr[i]).append("]");
            }else
            sb.append(arr[i]).append(",");*/
            sb.append(arr[i]).append(i == arr.length - 1?"]":",");
        }
        String str = sb.toString();

        return str;
    }



    private static void int2String() {
        int[] arr = {1,35,55,3345};
        String[] str = new String[100];
        for(int i = 0;i < arr.length;i++){
           str[i] = String.valueOf(arr[i]);
           if(i == arr.length-1){
               System.out.print(str[i] + "]");
           }else if(i == 0){
               System.out.print("[" + str[i] + ",");
           }else
            System.out.print(str[i]+",");
        }
    }
}
