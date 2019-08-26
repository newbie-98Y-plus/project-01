package com.day24;

public class Throwable_异常链 {
    public static void main(String[] args) {
        Throwable_异常链 th = new Throwable_异常链();
        th.test2();
    }
    public void test1() throws MyException {
        throw new MyException("这是我的自定义异常");
    }
    public void test2() {
        try {
            test1();
        } catch (MyException e) {
            RuntimeException re = new RuntimeException("运行时异常");
            re.initCause(e);//把自定义异常包装成运行时异常
            throw re;//抛出新异常
        }
    }
}
//自定义异常
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException() {
    }
}
