package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

class SideMenu extends PaneDecorator{
    private GUI gui;
    private JButton newGame;
    private JButton newPlayer;
    private JButton highScore;

    SideMenu(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    void addHighScoreActionListener(ActionHandler actionHandler){
        highScore.addActionListener(actionHandler);
    }

    void addNewPlayerActionListener(ActionHandler actionHandler){
        newPlayer.addActionListener(actionHandler);
    }

    void addNewGameActionListener(ActionHandler actionHandler) {
        newGame.addActionListener(actionHandler);
    }

    @Override
    JFrame createPane(JFrame frame) {
        newGame = new JButton("New Game");
        newPlayer = new JButton("New Player");
        highScore = new JButton("High Score");
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
