package com.day24;

import java.util.Objects;
import java.util.Scanner;

public class Test_借书系统 {
    public static void main(String[] args) {
        Book[] book = { new Book("三国演义","11"),
                        new Book("水浒传","22"),
                        new Book("西游记","33"),
                        new Book("红楼梦","44")
                        };
        Scanner sc = new Scanner(System.in);
        String str = "输入命令：1-按照书名查找图书；2-按照序号查找图书";
        isOrder(sc, str);
        do {
            System.out.println("请输入图书名称:");
            String line = sc.nextLine();
            boolean b1 = false;
            for (Book b : book) {
                    if (line.equals(b.getName())) {
                        System.out.println("book:" + b.getName());
                        b1 = true;
                        break;
                }
            }
            try{
                if(b1 == false) {
                    throw new BrrowException("图书不存在异常");//直接抛异常结束循环了，只执行第一次
                }
            } catch (BrrowException e) {
                System.out.println("图书不存在");
            }

            isOrder(sc,str);
        }while (true);


    }

    private static void isOrder(Scanner sc, String str) {
        do {
            System.out.println(str);
            String line1 = sc.nextLine();
            try {
                isDo(line1);
                break;
            } catch (ErrorException e) {
                System.out.println("命令输入错误!请根据提示输入数字命令");
            }
        }while (true);
    }

    public static void isDo(String line) throws ErrorException {
        if ("1".equals(line)  || "2".equals(line)) {
        }else
            throw new ErrorException("输入命令异常");
    }
}
class Book {
    private String name;
    private String sid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(sid, book.sid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sid);
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Book() {
    }

    public Book(String name, String sid) {
        this.name = name;
        this.sid = sid;
    }
}
class BrrowException extends Exception {
    public BrrowException(String message) {
        super(message);
    }

    public BrrowException() {
    }

}
class ErrorException extends Exception {
    public ErrorException() {
    }

    public ErrorException(String message) {
        super(message);
    }
}