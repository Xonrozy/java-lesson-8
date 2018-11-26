package ru.zhugin.se.ex2;

import ru.zhugin.se.ex1.MyWindow;

import javax.swing.*;
import java.awt.*;

public class WindowAndButton extends JFrame {
    public WindowAndButton() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());
        add(jbs[0], BorderLayout.EAST);
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);
        add(jbs[3], BorderLayout.NORTH);
        add(jbs[4], BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        WindowAndButton window = new WindowAndButton();
        window.setVisible(true);
    }
}
