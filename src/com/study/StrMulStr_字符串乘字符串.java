package com.study;

public class StrMulStr_字符串乘字符串{
    public static void main(String[] args) {

        String str = mulstr("99","99");
        System.out.println(str);
    }
    public static String mulstr(String num1,String num2){
        int[] value = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                value[i + j + 1] = value[i + j + 1] +  (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        //处理进位
        int carry = 0;
        for (int i = value.length -1; i >= 0; i--) {
             value[i] = value[i] + carry;
             carry = value[i]/10;
             value[i] = value[i]%10;
        }

        String str = strBuff(value);

        //处理前端的0
        str = str.replaceFirst("^(0+)", "");
        if(str.equals("")){
            return "0";
        }else
        return str;
    }
    public static String strBuff(int[] value){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < value.length; i++) {
            sb.append(value[i]);
        }
        return sb.toString();
    }
}


