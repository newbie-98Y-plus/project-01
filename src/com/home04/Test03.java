package com.home04;

import java.util.Arrays;
import java.util.Comparator;

//定义一个学生类，包含数学成绩、语文成绩、英语成绩三个属性
//创建若干学生对象，存储到数组中，然后使用Arrays工具类对数组中的学生对象排序，排序规则为：
//总成绩从高到低排序，如果总成绩相同，则按照数学成绩降序排序，
// 如果数学成绩相同，则按照语文成绩降序排序，
// 如果语文成绩相同，则按照英语成绩降序排序
public class Test03 {
    public static void main(String[] args) {
        Student[] stu = {
                new Student("渣渣辉",70,80,90),
                new Student("古天乐",80,90,70),
                new Student("陈小春",90,70,80),
                new Student("刘青云",90,85,75),
                new Student("awsl",90,88,72)

        };
        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int sum1 = o1.getChinese() + o1.getEnglish() + o1.getMath();
                int sum2 = o2.getChinese() + o2.getEnglish() + o2.getMath();
                if (sum1 != sum2){
                    return sum2 - sum1;
                }else if(o1.getMath() != o2.getMath()) {
                    return o2.getMath() - o1.getMath();
                }else if(o1.getChinese() != o2.getChinese()) {
                    return o2.getChinese() - o1.getChinese();
                }else
                    return o2.getEnglish() - o2.getEnglish();
            }
        });
        System.out.println(Arrays.toString(stu));


    }
}
class Student {
    private String name;
    private int Math;
    private int Chinese;
    private int English;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Math=" + Math +
                ", Chinese=" + Chinese +
                ", English=" + English +
                '}';
    }

    public Student() {
    }

    public Student(String name,int math, int chinese, int english) {
        this.name = name;
        Math = math;
        Chinese = chinese;
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }
}