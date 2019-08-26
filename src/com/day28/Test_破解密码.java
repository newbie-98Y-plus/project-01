package com.day28;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * 1. 生成一个长度是3的随机字符串，把这个字符串当作 密码
 *
 * 2. 创建一个破解线程，使用穷举法，匹配这个密码
 *
 * 3. 创建一个日志线程，打印都用过哪些字符串去匹配，这个日志线程设计为守护线程
 *
 * 提示： 破解线程把穷举法生成的可能密码放在一个容器中，日志线程不断的从这个容器中拿出可能密码，并打印出来。
 * 如果发现容器是空的，就休息1秒，如果发现不是空的，就不停的取出，并打印。
 */
public class Test_破解密码 {
    public static void main(String[] args) {
        String str = RandomStringUtils.randomAlphanumeric(3);
        LinkedList<String> lhs = new LinkedList<>();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("生成的密码:" + str);
                char[] crr = new char[3];
                stop:
                    for(int i = '0'; i <= 'z'; i++) {
                        for(int j = '0';  j <= 'z'; j++){
                            for(int k = '0'; k <= 'z'; k++){
                                if (!isLetterOrDigit(i,j,k)){
                                    continue ;
                                }
                                crr[0] = (char)i;
                                crr[1] = (char)j;
                                crr[2] = (char)k;
                                String guess = new String(crr);

                                lhs.offer(guess);
                                if (guess.equals(str)) {
                                    System.out.println("找到了，密码是：" + guess);
                                    System.out.println(lhs.size());
                                    break stop;
                                }
                            }
                        }
                    }

            }
        };
        System.out.println(lhs);//主线程中的lhs为空
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (lhs.isEmpty()) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //这样会报错ConcurrentModificationException
                      /*Iterator<String> iterator = lhs.iterator();
                      while (iterator.hasNext()) {
                         String gussPSW = iterator.next();
                         System.out.println("枚举产生的密码："+gussPSW);
                         iterator.remove();
                      }*/
                        //倒序
                        for (int i = lhs.size() - 1; i >= 0; i--) {
                            String s = lhs.get(i);
                            System.out.println("这次猜测的密码是：" + s);
                            lhs.remove(s);
                        }
                      }
                    }
                }

        };
        t1.start();
        t2.setDaemon(true);
        t2.start();

    }
    //判断i,j,k是否为字母或数字,Character自带静态方法isLetterOrDigit
    public static boolean isLetterOrDigit(int i,int j,int k) {
        return Character.isLetterOrDigit(i) && Character.isLetterOrDigit(j) && Character.isLetterOrDigit(k);
    }
}
