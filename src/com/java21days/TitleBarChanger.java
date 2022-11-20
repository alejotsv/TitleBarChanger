package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleBarChanger extends JFrame implements ActionListener {
    Dimension dim = new Dimension(300, 300);

    TitleBarChanger(){
        super("Guildenstern");
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JButton btn1 = new JButton("Guildenstern");
        btn1.addActionListener(this);
        JButton btn2 = new JButton("Rosencrantz");
        btn2.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(btn1);
        panel.add(btn2);
        add(panel);
        setVisible(true);
        pack();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton btn = (JButton) actionEvent.getSource();
        String text = btn.getText();
        this.setTitle(text);
    }
}
