package com.jonathanquirke.connectfour;

import javax.swing.*;
import java.awt.*;

class PlayerInformationPanel extends PaneDecorator {
    private GUI gui;

    PlayerInformationPanel(GUI gui) {
        this.gui = gui;
    }

    @Override
    JFrame getFrame() {
        return frame = createPane(gui.getFrame());
    }

    @Override
    JFrame createPane(JFrame frame) {
        frame.add(getScores(),BorderLayout.EAST);
        return frame;
    }


    private JPanel getScores()
    {
        JLabel pName = new JLabel();
        JLabel p2Name = new JLabel();
        JLabel pWin = new JLabel();
        JLabel p2Win = new JLabel();
        JLabel pLoses = new JLabel();
        JLabel p2Loses = new JLabel();

        pName.setText("Name: ");
        pWin.setText("Win: ");
        pLoses.setText("Loses: ");
        pWin.repaint();
        pLoses.repaint();

        p2Name.setText("Name: ");
        p2Win.setText("Win: ");
        p2Loses.setText("Loses: ");
        p2Win.repaint();
        p2Loses.repaint();

        Dimension scoreSize = new Dimension(100, 700);
        LayoutManager scoreGrid = new GridLayout(6,1);
        JPanel score = new JPanel(scoreGrid);
        score.add(pName);
        score.add(pWin);
        score.add(pLoses);
        score.add(p2Name);
        score.add(p2Win);
        score.add(p2Loses);
        score.setPreferredSize(scoreSize);
        return score;
    }
}
