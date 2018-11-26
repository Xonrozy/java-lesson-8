package ru.zhugin.se.ex4;

import javax.swing.*;

public class WindowButtonBoxLayout extends JFrame {
    public WindowButtonBoxLayout() {
        setSize(500, 350);
        setLocationRelativeTo(null);
        setTitle("BoxLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
            add(jbs[i]);
        }
    }

    public static void main(String[] args) {
        WindowButtonBoxLayout window = new WindowButtonBoxLayout();
        window.setVisible(true);
    }
}
