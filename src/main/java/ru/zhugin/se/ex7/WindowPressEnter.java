package ru.zhugin.se.ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowPressEnter extends JFrame {
    public WindowPressEnter(){
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JTextField field = new JTextField();
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your message: " + field.getText());
            }
        });
    }

    public static void main(String[] args) {
        WindowPressEnter window = new WindowPressEnter();
        window.setVisible(true);
    }
}
