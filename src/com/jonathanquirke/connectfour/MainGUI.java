package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends GUI {

    MainGUI(){
        LayoutManager border = new BorderLayout();
        frame.setTitle("Connect Four");
        frame.setSize(900,700);
        frame.setLayout(border);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public JFrame getFrame() {
        return frame;
    }

    @Override
    void frameShow(JFrame frame) {
        frame.setVisible(true);
    }
}
