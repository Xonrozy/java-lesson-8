package ru.zhugin.se.ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickWindow extends JFrame {
    public ButtonClickWindow(){
        final JButton quitButton = new JButton("Quit");
        quitButton.setBounds(50, 60, 80, 30);
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        final JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        panel.add(quitButton);

        setTitle("Quit button");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ButtonClickWindow window = new ButtonClickWindow();
        window.setVisible(true);
    }
}
