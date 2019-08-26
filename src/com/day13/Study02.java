package com.day13;

import java.util.Scanner;

//创建一个数组，里面存5个book对象，book类中包含页数，作者，出版社的属性，
// 有显示所有信息的方法，要求封装，键盘录入一个索引值，
// 根据这个索引值，输出对应的书的所有属性。（录屏）
public class Study02 {
    public static void main(String[] args) {

        Book[] book = new Book[5];
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        book[0] = new Book();
        book[0].setPage(1680);
        book[0].setAuthor("天蚕土豆");
        book[0].setPublishers("起点小说");
        book[1] = new Book(2560,"唐三","起点");
        book[2] = new Book(2789,"西红柿","起点");
        book[3] = new Book(2314,"鹅是老五","起点");
        book[4] = new Book(999,"EEE","大象出版社");
        switch (i){
            case 0:
                book[0].show();
                break;
            case 1:
                book[1].show();
                break;
            case 2:
                book[2].show();
                break;
            case 3:
                book[3].show();
                break;
            case 4:
                book[4].show();
                break;
            default:
                System.out.println("没有这本书");
                break;

        }


    }
}
class Book{
    private int page;
    private String author;
    private String Publishers;

    public Book() {
    }

    public Book(int page, String author, String publishers) {
        this.page = page;
        this.author = author;
        Publishers = publishers;
    }

    public void show(){
        System.out.println("页数:"+getPage()+"\t作者:"+getAuthor()+"\t出版社:"+getPublishers());
    }


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishers() {
        return Publishers;
    }

    public void setPublishers(String publishers) {
        Publishers = publishers;
    }
}