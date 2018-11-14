package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

class ColumnButtons extends PaneDecorator {
    private GUI gui;

    ColumnButtons(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    @Override
    JFrame createPane(JFrame frame) {
        JPanel colButton = createButtons();
        frame.add(colButton, BorderLayout.NORTH);
        return frame;
    }

    private JPanel createButtons(){
        JButton[] colButtons = new JButton[7];
        JPanel colButton = new JPanel();
        for (int i = 0; i < colButtons.length; i++)
        {
            colButtons[i] = new JButton("Column " + (i+1));
            colButton.add(colButtons[i]);
        }
        return colButton;
    }
}
