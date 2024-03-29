package com.day24;
import java.io.File;
public class IOTest {
            //递归找子文件中最小或者最大的
            static File maxFile;
            static File minFile;
            static long maxLength = 0;
            static long minLength = Long.MAX_VALUE;

            public static void main(String[] args) {
                String path = "c:/Windows";
                File f = new File(path);//创建一个文件路径
                long startTime = System.currentTimeMillis();
                getMaxMinFile(f);//获取最大或者最小文件
                long endTime = System.currentTimeMillis();

                if (maxFile != null) {
                    System.out.println(path + "目录下的最大文件是：" + maxFile);
                    System.out.println("文件长度是：" + maxLength + "字节");
                }

                if (minFile != null) {
                    System.out.println(path + "目录下的最小文件是：" + minFile);
                    System.out.println("文件长度是：" + minLength + "字节");
                }

                System.out.println("一共耗时" + (endTime - startTime) + "ms");
            }



            public static void getMaxMinFile(File f) {

                if(f.isFile()) {//判断是文件

                    if (f != null) {

                        if (f.length() >= maxLength) {
                            maxFile = f;
                            maxLength = f.length();
                        }

                        if (f.length() != 0 && f.length() < minLength) {
                            minFile = f;
                            minLength = f.length();
                        }
                    }
                } else if(f.isDirectory()) {//判断是文件夹
                    File[] fs = f.listFiles();//以文件数组的形式，返回当前文件夹下所有文件，不包括子文件
                    if (fs != null) {
                        for (File file : fs) {
                            getMaxMinFile(file);
                        }
                    }
                }
            }

}




