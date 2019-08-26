package com.day22;

public class Generic_Test03 {
    public static void main(String[] args) {
        MyInter1 mi1 = new MyInter1();
        mi1.test(888);
        MyInter2<Integer> mi2 = new MyInter2<>();
        mi2.test(666);
    }
}
interface MyInter<T> {
    public abstract void test(T t);
}
//泛型接口的实现一
class MyInter1 implements MyInter<Integer> {
    @Override
    public void test(Integer t) {
       // t = 12;
        System.out.println(t);
    }
}
//泛型接口的实现二
class MyInter2<E> implements MyInter<E> {

    @Override
    public void test(E e) {
        /*Integer ig = 9;
        e = (E)ig;*/
        System.out.println(e);
    }
}