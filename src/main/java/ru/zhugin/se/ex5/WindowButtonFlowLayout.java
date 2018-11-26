package ru.zhugin.se.ex5;

import javax.swing.*;
import java.awt.*;

public class WindowButtonFlowLayout extends JFrame {
    public WindowButtonFlowLayout() {
        setSize(400, 200);
        setLocationRelativeTo(null);
        setTitle("FlowLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new FlowLayout());
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
    }

    public static void main(String[] args) {
        WindowButtonFlowLayout window = new WindowButtonFlowLayout();
        window.setVisible(true);
    }
}
