package com.day19;

public class Regular {
    public static void main(String[] args) {
        System.out.println(isQQ("ewtwqyteywq"));//f
        System.out.println(isQQ("1243444"));//t
        System.out.println(isQQ("&&*6532753"));//f
        System.out.println(isQQ("053562627"));//f
        System.out.println("--------------------");
        System.out.println(regTest1("ab"));//f
        System.out.println(regTest1("tree"));//f
        System.out.println(regTest1("a"));//t
        System.out.println("--------------------");
        System.out.println(regTest2("s"));//t
        System.out.println(regTest2("S"));//t

        System.out.println(regTest3("00002004243200"));//2004243200
        System.out.println("---------------------------");

        System.out.println("tette".matches("\\S\\D.[a-z][a-z]"));//t
        System.out.println("ii555".matches("[a-z]\\D[0-9].."));//t
        System.out.println("\t".matches("\\s"));//t

    }
    public static String regTest3(String str) {
        str = str.replaceAll("^(0+)","");
        return str;
    }

    public static boolean regTest2(String str) {
        String regex = "[a-zA-Z]";
        return str.matches(regex);
    }



    public static boolean regTest1(String str) {
        String regex = "[abc]";//a、b、c中单个字符
        return str.matches(regex);
    }


    public static boolean isQQ(String str) {
        String regex = "[1-9][0-9]{4,14}";
        return str.matches(regex);
    }
}
