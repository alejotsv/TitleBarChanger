package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleBarChanger extends JFrame implements ActionListener {
    Dimension dim = new Dimension(300, 300);

    TitleBarChanger(){
        super("Guildenstern");
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("I was clicked");
    }
}
