package ru.zhugin.se.ex3;

import javax.swing.*;
import java.awt.*;

public class WindowButtonBorderLayout extends JFrame{
    public WindowButtonBorderLayout(){
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        JButton button = new JButton("Button 1 (PAGE_START)");
        add(button, BorderLayout.PAGE_START);
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        add(button, BorderLayout.CENTER);
        button = new JButton("Button 3 (LINE_START)");
        add(button, BorderLayout.LINE_START);
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        add(button, BorderLayout.PAGE_END);
        button = new JButton("5 (LINE_END)");
        add(button, BorderLayout.LINE_END);
    }

    public static void main(String[] args) {
        WindowButtonBorderLayout window = new WindowButtonBorderLayout();
        window.setVisible(true);
    }
}
