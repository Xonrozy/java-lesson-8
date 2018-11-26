package ru.zhugin.se.ex6;

import javax.swing.*;
import java.awt.*;

public class WindowButtonGridLayout extends JFrame {
    public WindowButtonGridLayout() {
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("GridLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new GridLayout(4, 3));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
    }

    public static void main(String[] args) {
        WindowButtonGridLayout window = new WindowButtonGridLayout();
        window.setVisible(true);
    }
}
