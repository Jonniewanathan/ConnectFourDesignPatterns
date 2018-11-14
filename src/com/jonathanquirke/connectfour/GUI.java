package com.jonathanquirke.connectfour;

import javax.swing.*;

abstract class GUI {

    JFrame frame = new JFrame();

    abstract void frameShow(JFrame frame);

    abstract JFrame getFrame();
}
