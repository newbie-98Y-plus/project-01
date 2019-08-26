package com.study;

public class Test {
    public static void main(String[] args) {
        System.out.println(test01("99","99"));
    }
    public static String test01(String num1,String num2){
        int[] arr = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1;i >= 0;i--){
            for(int j = num2.length() - 1;j >= 0;j--){
                arr[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        int carry = 0;
        for (int i = arr.length - 1;i >= 0;i--){
            arr[i] = arr[i] + carry;
            carry = arr[i]/10;
            arr[i] = arr[i]%10;
        }
        String str = strbuff(arr);
        str = str.replaceFirst("^(0+)","");
        if(str.equals("")){
            return "0";
        }else
        return str;
    }
    public static String strbuff(int[] arr){
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
