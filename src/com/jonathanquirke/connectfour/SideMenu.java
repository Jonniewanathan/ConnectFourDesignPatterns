package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

class SideMenu extends PaneDecorator{
    private GUI gui;

    SideMenu(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    @Override
    JFrame createPane(JFrame frame) {
        JButton newGame = new JButton("New Game");
        JButton newPlayer = new JButton("New Player");
        JButton highScore = new JButton("High Score");
        GridLayout menuGrid = new GridLayout(4, 1);
        Dimension scoreSize = new Dimension(100, 700);
        JPanel menuButtons = new JPanel(menuGrid);
        menuButtons.add(newGame);
        menuButtons.add(newPlayer);
        menuButtons.add(highScore);
        menuButtons.setPreferredSize(scoreSize);
        frame.add(menuButtons, BorderLayout.WEST);
        return frame;
    }
}
