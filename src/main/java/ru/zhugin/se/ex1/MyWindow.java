package ru.zhugin.se.ex1;

import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();
        myWindow.setVisible(true);
    }
}
