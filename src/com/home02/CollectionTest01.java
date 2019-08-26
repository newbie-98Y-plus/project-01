package com.home02;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collection;
//1、定义一个方法，可以用于统计指定Collection中指定元素的个数
//2、定义一个方法，可以删除指定Collection中指定值的元素
//3、定义一个Collection集合，存入多个字符串，删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
//4、参考课上代码，完善自定义集合，实现初始化、添加元素、删除元素、清空集合、获取集合元素个数、集合转数组、判断是否包含某个元素等功能。
public class CollectionTest01 {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection();//实现初始化
        mc.add("ewq");//添加元素
        mc.add(222);
        mc.add("egwyq&^$%#@");
        mc.delete(0);//删除元素
        System.out.println(mc.getSize());//获取集合元素个数
        System.out.println(mc.contains(222));//判断是否包含某个元素
        mc.clear();//清空集合
        System.out.println(mc.getSize());
        Collection cc = new ArrayList();
        cc.add("222");
        System.out.println(Arrays.toString(mc.turn(cc)));//集合转数组



    }

}
class MyCollection {
    private Object[] obj;//对象数组
    private int count;//有效数据
    MyCollection(){
        obj = new Object[10];
    }
    public void add(Object obj) {
        if(count == this.obj.length) {
            Object[] obj1 = new Object[this.obj.length * 2];
            for (int i = 0; i < count; i++) {
                obj1[i] = this.obj[i];
            }
            this.obj = obj1;
        }
        this.obj[count] = obj;
        count++;
    }
    public int getSize() {
        return count;
    }
    public void delete(int index) {
        if(index < 0||index >= count){
            return;
        }
        for (int i = 0; i < count; i++) {
            obj[i] = obj[i + 1];
        }
        count--;
    }
    public void clear() {
        for (int i = 0; i < count; i++) {
            obj[i] = null;
        }
        count = 0;
    }
    public Boolean contains(Object obj) {
        for (int i = 0; i < count; i++) {
            if(this.obj[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }
    public Object[] turn(Collection cc) {
        return cc.toArray();
    }



}
