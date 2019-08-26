package com.home08;

import javax.swing.*;

public class TestGUI {
    public static void main(String[] args) {
        //主窗体
        JFrame jf = new JFrame("天使的翅膀");
        //大小
        jf.setSize(400,300);
        //位置
        jf.setLocation(200,200);
        //绝对定位
        jf.setLayout(null);

        //按钮
        JButton jb = new JButton("锤他");

        jb.setBounds(200,200,230,250);

        //主窗体添加按钮
        jf.add(jb);

        // 关闭窗体的时候，退出程序
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 让窗体变得可见
        jf.setVisible(true);


    }
}
