package com.jonathanquirke.connectfour;

import javax.swing.*;

abstract class PaneDecorator extends GUI{
    @Override
    void frameShow(JFrame frame) {
        frame.setVisible(true);
    }

    @Override
    abstract JFrame getFrame();

    abstract JFrame createPane(JFrame frame);
}
