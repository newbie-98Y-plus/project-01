package com.day28;

import java.io.*;
import java.util.Scanner;

//现在通过多线程调整这个思路：
//遍历所有文件，当遍历到文件是.java的时候，创建一个线程去查找这个文件的内容，不必等待这个线程结束，继续遍历下一个文件
public class Test_线程test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        File file = new File(line);
        suffixName(file);
    }
    public static void suffixName(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    String str = f.getName();
                    String suffix;
                    if (str.contains(".")) {
                        suffix = str.substring(str.lastIndexOf("."));
                        if (".java".equals(suffix)) {
                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        FileReader fr = new FileReader(f);
                                        char[] c = new char[(int) f.length()];
                                        int len;
                                        while ((len = fr.read(c)) != -1) {
                                            System.out.println(new String(c,0,len));
                                        }
                                        fr.close();
                                    } catch (FileNotFoundException e) {
                                        e.printStackTrace();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }

                                }
                            }).start();
                        }

                    }else {
                        suffix = "space";
                    }
                }else {
                    suffixName(f);
                }
            }
        }
    }


}
